package com.adsurge.adn.E1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class A extends RelativeLayout implements View.OnClickListener {
    public int a;
    public final int b;
    public final q c;
    public ViewGroup d;
    public ImageView e;
    public ImageView f;
    public b g;
    public boolean h;
    public final Runnable i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            A a = A.this;
            if (a.h) {
                b bVar = a.g;
                if (bVar != null) {
                    bVar.onDismiss();
                }
                A.this.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a();

        void b();

        void onDismiss();

        void onShow();
    }

    public final void a() {
        com.adsurge.adn.I0.g.d(this.i);
        com.adsurge.adn.I0.g.a(this.i, this.a);
    }

    public void b() {
        if (this.h) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.adsurge.adn.I0.i.a(getContext(), 44));
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
            b bVar = this.g;
            if (bVar != null) {
                bVar.onDismiss();
            }
            this.h = false;
        }
    }

    public final void c() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setBackgroundColor(-1);
        this.d.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.adsurge.adn.I0.i.a(getContext(), 44));
        layoutParams.addRule(12, -1);
        this.d.setLayoutParams(layoutParams);
        addView(this.d, layoutParams);
        View view = new View(getContext());
        view.setBackgroundColor(Color.parseColor("#D5D5D6"));
        this.d.addView(view, new FrameLayout.LayoutParams(-1, 1));
        int iA = com.adsurge.adn.I0.i.a(getContext(), 4);
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageBitmap(com.adsurge.adn.x1.n.a("iVBORw0KGgoAAAANSUhEUgAAACQAAAA+CAYAAABDTbllAAAAAXNSR0IArs4c6QAAAERlWElmTU0AKgAAAAgAAYdpAAQAAAABAAAAGgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAJKADAAQAAAABAAAAPgAAAAAAXmzfAAACf0lEQVRoBc3ZT2sTQRQA8JlGD9sqaME2tceexKSN9g8oHoroJ/AbSKkofgDxlG8hFM+9WL3mkB4CbfBiBVn1A4itGAUPCq00m+ebhSlZs5Pd7Lw3k4HJLLOT9347ySFvIsSYNenDU6mt3u5F8FhKMSkAXn8KD7a1o6QvXI3XF5c3oAdvMN8S9mvYH8yW508734/2lGFCvbhqMQbEFuZL5AUBz+v1ejyXuMEJ68MMfE0AxFSz2ZxS+Z2AhmEUQgr5tt1u/1bX59QLZ8vCoObnxHl4qA0D26dvUIx5MCUQd8PwINT52EBFMArFAiqKYQHZYMhBthhSEAWGDESFIQFRYqxB1BgrEAemMIgLUwjEiRkZxI0ZCeQCkxvkCpML5BKTCXKNGQrygTGCfGFSQT4xAyDfmARoHDBnoOqNtVtRN9rHifQ6DUuV/6sD9WaOFgOibu8JBveOUQ8YI6SAuIxNe2IJ4lCI4GvaPY45vSs7puCApxSRPN6tVu9cNq2hnI+PY350voUz5avzGHjZEHwOZPd+eWbhVafz5cSwhmRa75D4+OHdIzxAemmMCuKmi51KVK4AICtLK1t4PLJhhEnxvgTBvTDc/2VcY3EjAVJxfKMGQL5RqSCfKCPIF2ooyAcqE+QalQvkEpUb5Ao1EsgFamQQN6oQiBNVGMSFsgJxoKxB1CgSECWKDESFIgVRoMhBtigWkA3q7Ee+CkLZpJSAhcNmnsKhVlu/pHOzgVSCvKjT3p8XGsT2kekEaswqHBDevTJ94WKr1Tph3SGNyrNTQRBgkWw6YNCRCMcM1Haj0fir0rH/K93/TAqFbbOyuPoZ559in8S+UxLTz/rXjdX1PzhESMVXt6s7AAAAAElFTkSuQmCC"));
        this.e.setPadding(iA, iA, iA, iA);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(com.adsurge.adn.I0.i.a(getContext(), 24), com.adsurge.adn.I0.i.a(getContext(), 24));
        layoutParams2.gravity = 17;
        layoutParams2.rightMargin = com.adsurge.adn.I0.i.a(getContext(), 48);
        this.d.addView(this.e, layoutParams2);
        this.e.setOnClickListener(this);
        ImageView imageView2 = new ImageView(getContext());
        this.f = imageView2;
        imageView2.setImageBitmap(com.adsurge.adn.x1.n.a("iVBORw0KGgoAAAANSUhEUgAAACQAAAA+CAYAAABDTbllAAAAAXNSR0IArs4c6QAAAERlWElmTU0AKgAAAAgAAYdpAAQAAAABAAAAGgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAJKADAAQAAAABAAAAPgAAAAAAXmzfAAACY0lEQVRoBeXZvW/TQBQA8Hd2hEjFAkIpatWNrbhIhLFDxMLE1I0RVa3UP6ELWdgZUIe2Mxv/AWJFAgIqbrdsoUKoVZdW/SC1j3tuazmpnfjjvXeVeJIl31m+9/PdWfJLAG5YqKRn1mu+BKUWtIZjt+as+T++fE5elziPQY/mnq6GWr9JJA2VguWdn53NRB/7qYMZ2u22o0GvDmVzzEytz841F4f6WZsujt7v9++cnJ2/TsmEM/ii8WBqd+/P7+8p18m7IlCv1/vbmJx+bkafSckgioqWDBHOLf0KFOyngLBLSS1fvKkxq+c1vUDBJ9BwH9spoc1GX+Lc6AMgBNhGXQPZRqWCbKIyQbZQI0E2UGNB0qhcIElUbpAUqhBIAlUYxI0qBeJElQZxoSqBOFCVQdQoEhAligxEhSIFUaDIQVVRLKAqKDZQWRQrqAyKHZQTFbo1dx5/S4jrMryRK3y/47sano2o+5zgPFzB/CKgiwet/1IadrMe2tR7E2Igz5u/G6iTjxrgcRYItP4gArrCmGr4SRbGzM7Gjt95zw7Kidnc3vq2fIVle8sKYJaUMrvrMlhAZTFoIgdVwZCDqmJIQRQYMhAVhgREiakMosZUAnFgSoO4MKVAnJjCIG5MIZAEJjdICpMLJIkZC5LGjATZwGSCbGFSQTYx10C2MQOgm4BBUFwohup0bUypgtXBwAc5DkAd0Td1q9W6vXdwdKi1rqUlMHWTCAZzRzNUr9fjMmQYJInB3NG/0t1uN2hMTj007YFSVxqDoHiJXLi3EjgHhxDCguk/Nse77a2vb5NFHN7w38U/+VL4Ter/OVkAAAAASUVORK5CYII="));
        this.f.setPadding(iA, iA, iA, iA);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(com.adsurge.adn.I0.i.a(getContext(), 24), com.adsurge.adn.I0.i.a(getContext(), 24));
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = com.adsurge.adn.I0.i.a(getContext(), 48);
        this.d.addView(this.f, layoutParams3);
        this.f.setOnClickListener(this);
    }

    public void e() {
        q qVar = this.c;
        if (qVar == null) {
            return;
        }
        this.e.setAlpha(qVar.canGoBack() ? 1.0f : 0.5f);
        this.f.setAlpha(this.c.canGoForward() ? 1.0f : 0.5f);
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.e) {
            b bVar = this.g;
            if (bVar != null) {
                bVar.a();
            }
            q qVar = this.c;
            if (qVar != null && qVar.canGoBack()) {
                this.c.goBack();
            }
        } else if (view == this.f) {
            b bVar2 = this.g;
            if (bVar2 != null) {
                bVar2.b();
            }
            q qVar2 = this.c;
            if (qVar2 != null && qVar2.canGoForward()) {
                this.c.goForward();
            }
        }
        e();
    }

    public void setAutoDismissTime(int i) {
        if (i <= 0) {
            return;
        }
        this.a = i;
    }

    public void setCallback(b bVar) {
        this.g = bVar;
    }

    public A(Context context, q qVar) {
        super(context);
        this.a = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        this.b = 200;
        this.i = new a();
        this.c = qVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setVisibility(8);
        c();
    }

    public void d() {
        a();
        if (!this.h) {
            q qVar = this.c;
            if (qVar == null || qVar.canGoBack() || this.c.canGoForward()) {
                if (getVisibility() != 0) {
                    setVisibility(0);
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, "translationY", com.adsurge.adn.I0.i.a(getContext(), 44), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.start();
                b bVar = this.g;
                if (bVar != null) {
                    bVar.onShow();
                }
                this.h = true;
                e();
            }
        }
    }
}
