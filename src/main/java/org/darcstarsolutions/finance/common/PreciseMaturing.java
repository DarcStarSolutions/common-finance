package org.darcstarsolutions.finance.common;

import org.joda.time.*;

/**
 * Created by tetn on 10/15/14.
 */
public interface PreciseMaturing extends Maturing {

    public LocalDateTime getMaturityDateTime();

    public LocalDateTime getPreciseCurrentTime();

    public Seconds getSecondsUntilMaturity();

    public Minutes getMinutesUntilMaturity();

    public Hours getHoursUntilMaturity();

    public Interval getPreciseTimeUntilMaturity();
}
