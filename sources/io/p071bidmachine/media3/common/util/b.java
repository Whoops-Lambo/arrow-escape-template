package io.p071bidmachine.media3.common.util;

import com.explorestack.protobuf.StringValue;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "expand";
        }
        if (i == 2) {
            return "collapse";
        }
        if (i == 3) {
            return "visual_diff";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "VIEW_SIBLINGS";
        }
        if (i == 2) {
            return "ALL_VIEWS";
        }
        if (i == 3) {
            return "WINDOWS";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "PARENT_VIEW";
        }
        if (i == 2) {
            return "SCREEN";
        }
        if (i == 3) {
            return "SAFE_AREA";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "BID_ATTR_13";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "ADM_HINT";
    }

    public static void c(int i, String str, String str2) {
        a.A(str2, str + i);
    }

    public static void d(m mVar, e0 e0Var) {
        e0Var.c(new n(mVar));
    }

    public static void e(String str, String str2, String str3) {
        a.A(str3, str + str2);
    }

    public static StringValue b(StringValue stringValue, StringValue stringValue2) {
        return StringValue.newBuilder(stringValue).mergeFrom(stringValue2).buildPartial();
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "Track";
            case 2:
                return "Open";
            case 3:
                return "NotifyOpen";
            case 4:
                return "Skip";
            case 5:
                return "Close";
            case 6:
                return "Mute";
            case 7:
                return "UnMute";
            case 8:
                return "Repeat";
            case 9:
                return "Show";
            case 10:
                return "Hide";
            case 11:
                return "Progress";
            case 12:
                return "Schedule";
            case 13:
                return "Start";
            case 14:
                return "LockVisibility";
            case 15:
                return "UnlockVisibility";
            case 16:
                return "SimulateClick";
            case 17:
                return "OpenPrivacySheet";
            case 18:
                return "ToggleStateGroups";
            case 19:
                return "Expand";
            case 20:
                return "Collapse";
            case 21:
                return "RequestPermission";
            case 22:
                return "ReportClick";
            case 23:
                return "Play";
            case 24:
                return "Pause";
            case 25:
                return "ChangeLayout";
            case 26:
                return "ChangeActivity";
            default:
                return "null";
        }
    }
}
