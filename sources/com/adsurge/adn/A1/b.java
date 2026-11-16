package com.adsurge.adn.A1;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.adsurge.adn.x1.v;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, Handler.Callback {
    public static final String q = "b";
    public AudioManager b;
    public final Context c;
    public volatile int d;
    public String e;
    public final Handler k;
    public final Handler l;
    public HandlerThread m;
    public i n;
    public com.adsurge.adn.u1.c o;
    public volatile MediaPlayer a = null;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public int j = 1;
    public int p = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.A1.a.b {
        public final /* synthetic */ String a;

        @Override // com.adsurge.adn.A1.a.b
        public void a(String str, int i) {
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.adsurge.adn.A1.a.b
        public void onSuccess(String str) {
            b.this.d(str);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.A1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0063b implements Runnable {
        public final /* synthetic */ Throwable a;

        public RunnableC0063b(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.a(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.c();
                float f = b.this.i.get() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.8f;
                if (b.this.a != null) {
                    b bVar = b.this;
                    if (bVar.j != 0) {
                        try {
                            bVar.a.setVolume(f, f);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.f();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.e();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = b.this.n;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface i {
        void a();

        void a(Throwable th);

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public final void d(String str) {
        try {
            this.h.set(false);
            this.f.set(true);
            this.a.setDataSource(str);
            this.a.prepareAsync();
        } catch (Throwable th) {
            this.j = 0;
            this.l.post(new RunnableC0063b(th));
        }
    }

    public final synchronized void k() {
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.m = null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.j = 2;
        this.g.set(true);
        this.l.post(new f());
        if (this.h.get()) {
            i();
        }
    }

    public final void a() {
        int i2 = this.j;
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 0 || this.a == null) {
            return;
        }
        this.j = 4;
        r();
        this.a.stop();
        this.l.post(new h());
    }

    public void b(String str) {
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        this.k.sendMessage(message);
    }

    public int f() {
        if (this.d == 0) {
            try {
                if (h() && this.g.get()) {
                    this.d = this.a.getDuration();
                }
            } catch (Exception unused) {
            }
        }
        return this.d;
    }

    public final void g() {
        this.f.set(false);
        if (this.a == null) {
            this.a = new MediaPlayer();
        } else {
            try {
                this.a.reset();
            } catch (Throwable unused) {
                this.a = new MediaPlayer();
            }
        }
        this.h.set(false);
        this.d = 0;
        this.j = 1;
        this.b = (AudioManager) this.c.getSystemService("audio");
        this.a.setOnPreparedListener(this);
        this.a.setOnCompletionListener(this);
        this.a.setOnErrorListener(this);
        this.a.setOnInfoListener(this);
    }

    public final boolean h() {
        int i2;
        return (this.a == null || (i2 = this.j) == 0 || i2 == 1) ? false : true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            c(String.valueOf(message.obj));
            return false;
        }
        if (i2 == 2) {
            j();
            return false;
        }
        if (i2 == 3) {
            a();
            return false;
        }
        if (i2 == 5) {
            n();
            return false;
        }
        if (i2 == 6) {
            p();
            return false;
        }
        if (i2 != 7) {
            return false;
        }
        c();
        return false;
    }

    public void i() {
        this.k.sendEmptyMessage(2);
    }

    public final void j() {
        this.h.set(true);
        if (this.f.get() && this.g.get() && this.j != 3 && this.a != null) {
            int i2 = this.j;
            if (i2 == 6 || i2 == 4) {
                c(this.e);
                this.h.set(true);
            } else {
                s();
                this.a.start();
                this.j = 3;
                this.l.post(new c());
            }
        }
    }

    public final void l() {
        try {
            this.a.reset();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void m() {
        this.k.sendEmptyMessage(5);
    }

    public final void n() {
        try {
            if (this.a == null || this.j == 0 || this.i.get()) {
                return;
            }
            this.a.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.i.set(true);
            this.l.post(new d());
            r();
        } catch (Exception unused) {
        }
    }

    public void o() {
        this.k.sendEmptyMessage(6);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.j != 6) {
            this.j = 6;
            r();
            this.l.post(new g());
        }
        int i2 = this.p;
        if (i2 > 0) {
            this.p = i2 - 1;
            i();
        }
    }

    public final void p() {
        try {
            if (this.a == null || this.j == 0 || !this.i.get()) {
                return;
            }
            this.a.setVolume(0.8f, 0.8f);
            this.i.set(false);
            this.l.post(new e());
            s();
        } catch (Exception unused) {
        }
    }

    public void q() {
        this.k.sendEmptyMessage(3);
    }

    public final void r() {
        AudioManager audioManager = this.b;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
        }
    }

    public final void s() {
        AudioManager audioManager;
        if (this.i.get() || this.j != 3 || (audioManager = this.b) == null) {
            return;
        }
        audioManager.requestAudioFocus(null, 3, 2);
    }

    public b(Context context) {
        this.c = context;
        HandlerThread handlerThread = new HandlerThread("b");
        this.m = handlerThread;
        handlerThread.start();
        this.k = new v(this, this.m.getLooper());
        this.l = new Handler(Looper.getMainLooper());
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
        g();
        String strA = com.adsurge.adn.A1.a.a(str);
        if (!TextUtils.isEmpty(strA)) {
            d(strA);
        } else {
            a(str);
        }
    }

    public int e() {
        try {
            if (h()) {
                if (this.j == 6) {
                    return f();
                }
                return this.a.getCurrentPosition();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void b() {
        this.k.sendEmptyMessage(7);
    }

    public final void c() {
        if (this.a != null) {
            l();
            this.a.release();
            this.a = null;
            this.j = 1;
        }
        k();
    }

    public int d() {
        return this.j;
    }

    public final void a(String str) {
        com.adsurge.adn.A1.a.a(this.o, str, new a(str));
    }

    public void a(int i2) {
        this.p = i2;
        this.a.setLooping(this.p == -1);
    }

    public void a(i iVar) {
        this.n = iVar;
    }
}
