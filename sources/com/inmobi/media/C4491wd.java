package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.C4491wd;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import defpackage.q63;
import defpackage.sb3;

/* JADX INFO: renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4491wd {
    public final Ej a;
    public final Y9 b;
    public C4075hd c;
    public C3880ad d;
    public C3880ad e;
    public C3880ad f;

    public final void b(String str, boolean z) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        Ej ej = this.a;
        if (ej != null) {
            ej.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public C4491wd(Ej ej, Y9 y9) {
        this.a = ej;
        this.b = y9;
    }

    public final void a(Activity activity, String str) {
        str.getClass();
        activity.getClass();
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C4075hd c4075hd = new C4075hd(activity, this.b);
        this.c = c4075hd;
        c4075hd.setPlaybackData(str);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParamsC = q63.c(-1, -1, 13);
        C4075hd c4075hd2 = this.c;
        if (c4075hd2 != null) {
            c4075hd2.setLayoutParams(layoutParamsC);
        }
        C4103id c4103id = new C4103id(activity);
        c4103id.setOnTouchListener(new sb3(5));
        c4103id.setBackgroundColor(-16777216);
        c4103id.addView(this.c);
        Y9 y10 = this.b;
        if (y10 != null) {
            ((Z9) y10).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c4103id, new ViewGroup.LayoutParams(-1, -1));
        C4075hd c4075hd3 = this.c;
        if (c4075hd3 != null) {
            c4075hd3.setViewContainer(c4103id);
        }
        C4075hd c4075hd4 = this.c;
        if (c4075hd4 != null) {
            c4075hd4.requestFocus();
        }
        C4075hd c4075hd5 = this.c;
        if (c4075hd5 != null) {
            c4075hd5.setOnKeyListener(new View.OnKeyListener() { // from class: ki3
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return C4491wd.a(this.a, view, i, keyEvent);
                }
            });
        }
        C4075hd c4075hd6 = this.c;
        if (c4075hd6 != null) {
            c4075hd6.setListener(new C4464vd(this));
        }
        C4075hd c4075hd7 = this.c;
        if (c4075hd7 != null) {
            c4075hd7.a();
        }
    }

    public static boolean b() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return false;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean a(C4491wd c4491wd, View view, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        C4075hd c4075hd = c4491wd.c;
        if (c4075hd == null) {
            return true;
        }
        c4075hd.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", C4664b4.j.P);
        }
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return -1;
        }
        Ej ej = this.a;
        if (((ej == null || (renderingConfig = ej.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && AbstractC4221mk.g) {
            return 0;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        Ej ej = this.a;
        if (ej != null) {
            ej.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(String str, int i) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        Ej ej = this.a;
        if (ej != null) {
            ej.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
