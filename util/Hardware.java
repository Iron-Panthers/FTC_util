package org.firstinspires.ftc.team7316.util;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Contains all the hardware names and actual hardware objects
 */

public class Hardware {

    public static Hardware instance = null;

    public static final String tag = "IronPanthers";

    public static Telemetry telemetry;

    //Create all the hardware fields

    /**
     * Initialize all the hardware fields here
     */
    public Hardware (HardwareMap map) {

    }

    public static void setHardwareMap(HardwareMap map) {
        instance = new Hardware(map);
    }

    public static void setTelemetry(Telemetry telemetry) {
        Hardware.telemetry = telemetry;
    }

    public static void log(String caption, Object value) {
        if (telemetry != null) {
            telemetry.addData(caption, value);
        }
    }
}