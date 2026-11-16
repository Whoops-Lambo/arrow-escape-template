package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzb extends zzbzk {
    public final Map c;
    public final Activity d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public zzbzb(zzcly zzclyVar, Map map) {
        long j;
        super(zzclyVar, "createCalendarEvent");
        this.c = map;
        this.d = zzclyVar.zzj();
        this.e = f(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
        this.h = f("summary");
        String str = (String) map.get("start_ticks");
        long j2 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j = -1;
            }
        }
        this.f = j;
        String str2 = (String) this.c.get("end_ticks");
        if (str2 != null) {
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.g = j2;
        this.i = f("location");
    }

    public final String f(String str) {
        Map map = this.c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
