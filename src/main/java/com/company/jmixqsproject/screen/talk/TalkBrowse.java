package com.company.jmixqsproject.screen.talk;

import com.company.jmixqsproject.service.TalksScheduleService;
import io.jmix.ui.ScreenBuilders;
import io.jmix.ui.component.Calendar;
import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Talk;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@UiController("Talk.browse")
@UiDescriptor("talk-browse.xml")
@LookupComponent("talksTable")
public class TalkBrowse extends StandardLookup<Talk> {
    @Autowired
    private ScreenBuilders screenBuilders;

    @Autowired
    private TalksScheduleService talkScheduleService;

    @Subscribe("talksCalendar")
    public void onTalksCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<LocalDateTime> event) {
        screenBuilders.editor(Talk.class, this)
                .editEntity((Talk) event.getEntity())
                .withOpenMode(OpenMode.DIALOG)
                .withScreenClass(TalkEdit.class)
                .withAfterCloseListener(afterCloseEvent -> {
                    if (afterCloseEvent.closedWith(StandardOutcome.COMMIT)) {
                        getScreenData().loadAll();
                    }
                }).show();
    }

    @Subscribe("talksCalendar")
    public void onTalksCalendarCalendarEventMove(Calendar.CalendarEventMoveEvent<LocalDateTime> event) {
        talkScheduleService.rescheduleTalk((Talk) event.getEntity(), event.getNewStart());
        getScreenData().loadAll();
    }
}