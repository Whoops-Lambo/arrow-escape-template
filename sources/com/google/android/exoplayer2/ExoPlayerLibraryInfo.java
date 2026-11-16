package com.google.android.exoplayer2;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final String TAG = "ExoPlayerLib";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.18.2";
    public static final int VERSION_INT = 2018002;
    public static final String VERSION_SLASHY = "ExoPlayerLib/2.18.2";
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "goog.exo.core";

    public static synchronized void registerModule(String str) {
        if (registeredModules.add(str)) {
            registeredModulesString += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return registeredModulesString;
    }

    private ExoPlayerLibraryInfo() {
    }
}
