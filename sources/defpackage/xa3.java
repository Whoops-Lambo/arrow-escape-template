package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xa3 implements wg3 {
    public ng3 a;
    public mg3 b;
    public pg3 c;
    public qg3 d;
    public vg3 e;
    public sg3 f;
    public ug3 g;
    public boolean h = false;
    public final MediaPlayer i;
    public final va3 j;
    public ne3 k;
    public Surface l;
    public final Object m;
    public volatile boolean n;

    public final void c() {
        this.a = null;
        this.c = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void a(long j, int i) {
        int i2 = Build.VERSION.SDK_INT;
        MediaPlayer mediaPlayer = this.i;
        if (i2 < 26) {
            mediaPlayer.seekTo((int) j);
            return;
        }
        if (i == 0) {
            mediaPlayer.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            mediaPlayer.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            mediaPlayer.seekTo((int) j, 2);
        } else if (i != 3) {
            mediaPlayer.seekTo((int) j);
        } else {
            mediaPlayer.seekTo((int) j, 3);
        }
    }

    public final void d() {
        try {
            this.i.reset();
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "Ses+kBc=", 278);
        }
        ne3 ne3Var = this.k;
        if (ne3Var != null) {
            try {
                ne3Var.close();
            } catch (Throwable th2) {
                rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "SeshkAKvbOqFTt5cqBC0KWjhOIcAuQ==", 180);
            }
            this.k = null;
        }
        c();
        f();
    }

    public final void e() {
        try {
            Surface surface = this.l;
            if (surface != null) {
                surface.release();
                this.l = null;
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "SeshkAKvbPSVWNFcjxQ=", 475);
        }
    }

    public final void f() {
        MediaPlayer mediaPlayer = this.i;
        va3 va3Var = this.j;
        mediaPlayer.setOnPreparedListener(va3Var);
        mediaPlayer.setOnBufferingUpdateListener(va3Var);
        mediaPlayer.setOnCompletionListener(va3Var);
        mediaPlayer.setOnSeekCompleteListener(va3Var);
        mediaPlayer.setOnVideoSizeChangedListener(va3Var);
        mediaPlayer.setOnErrorListener(va3Var);
        mediaPlayer.setOnInfoListener(va3Var);
    }

    public xa3() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(xg3.a, null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(objNewInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
                } catch (Throwable th) {
                    try {
                        rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "SOs5pha+fc6URtJ+gx+0OlTiIZAR", 92);
                        declaredField.setAccessible(false);
                    } catch (Throwable th2) {
                        declaredField.setAccessible(false);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                rz.kgy(th3, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "SOs5pha+fc6URtJ+gx+0OlTiIZAR", 100);
            }
        }
        try {
            this.i.setAudioStreamType(3);
        } catch (Throwable th4) {
            rz.kgy(th4, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "B+cjnBfi", 67);
        }
        this.j = new va3(this);
        f();
    }

    public final void b(String str) throws IOException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme);
        MediaPlayer mediaPlayer = this.i;
        if (!zIsEmpty && scheme.equalsIgnoreCase("file")) {
            mediaPlayer.setDataSource(uri.getPath());
        } else {
            mediaPlayer.setDataSource(str);
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        e();
    }
}
