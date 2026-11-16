package com.bytedance.sdk.component.ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ft;
import com.bytedance.sdk.component.utils.uf;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy extends rz implements ft.kgy {
    private final int ahm;
    private long at;
    private final int ct;
    private boolean dg;
    private volatile float fi;
    private String fpp;
    private final Context noq;
    private long nu;
    private final int rz;
    private View.OnTouchListener sx;
    private int twf;
    private float um;
    private final List<Integer> uq;
    private float xh;
    private volatile float yo;
    private float gf = -1.0f;
    private float ra = -1.0f;
    private final Handler vs = new ft(com.bytedance.sdk.component.utils.gf.kgy().getLooper(), this);
    InterfaceC0217kgy kgy = new InterfaceC0217kgy() { // from class: com.bytedance.sdk.component.ra.kgy.1
        @Override // com.bytedance.sdk.component.ra.kgy.InterfaceC0217kgy
        public void kgy() {
            if (kgy.this.gf == -1.0f && kgy.this.ra == -1.0f && kgy.this.at == -1) {
                float unused = kgy.this.gf;
                float unused2 = kgy.this.ra;
                kgy kgyVar = kgy.this;
                kgyVar.gf = kgyVar.yo;
                kgy kgyVar2 = kgy.this;
                kgyVar2.ra = kgyVar2.fi;
                kgy kgyVar3 = kgy.this;
                kgyVar3.at = kgyVar3.nu;
                kgy.this.dg = true;
            }
            float unused3 = kgy.this.gf;
            float unused4 = kgy.this.ra;
        }

        @Override // com.bytedance.sdk.component.ra.kgy.InterfaceC0217kgy
        public void kgy(int i) {
            kgy.this.twf = i;
            kgy.this.ahm();
        }
    };
    private int gm = -1;
    private final List<Integer> kus = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ra.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0217kgy {
        void kgy();

        void kgy(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm() {
        this.gf = -1.0f;
        this.ra = -1.0f;
        this.at = -1L;
    }

    private void kgy(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "evwvnBeuaMCFZdlpgwSjIHfnPoEGsmzV", "S/wilgaveuSMQ9RWqQelJk8=", 160);
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.twf);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.vs.sendMessageDelayed(messageObtain, 200L);
    }

    public kgy(Context context, int i, int i2, List<Integer> list, int i3) {
        this.noq = context;
        if (i == -1) {
            this.ahm = uf.kgy(context);
        } else {
            this.ahm = uf.kgy(context, i);
        }
        this.rz = uf.kgy(context, i2);
        this.uq = list;
        this.ct = i3;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        kgy kgyVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.nu = SystemClock.elapsedRealtime();
        this.yo = x;
        this.fi = y;
        if (action != 0) {
            if (action != 1) {
                kgyVar = this;
            } else {
                kgyVar = this;
                if (kgyVar.kgy(x, y, this.xh, this.um, this.noq)) {
                    int iKgy = kgyVar.kgy(kgyVar.yo, kgyVar.fi, kgyVar.nu);
                    boolean zContains = kgyVar.kus.contains(Integer.valueOf(kgyVar.twf));
                    kgyVar.kgy(view, motionEvent, iKgy, !zContains);
                    if (!zContains) {
                        kgyVar.kus.add(Integer.valueOf(kgyVar.twf));
                    }
                    if (iKgy == 0) {
                        motionEvent.setAction(3);
                    }
                }
            }
        } else {
            kgyVar = this;
            kgyVar.xh = x;
            kgyVar.um = y;
        }
        View.OnTouchListener onTouchListener = kgyVar.sx;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ra.rz
    public void kgy(View.OnTouchListener onTouchListener) {
        this.sx = onTouchListener;
    }

    public InterfaceC0217kgy kgy() {
        return this.kgy;
    }

    public void kgy(String str) {
        this.fpp = str;
    }

    private int kgy(float f, float f2, long j) {
        if (this.gf == -1.0f && this.ra == -1.0f && this.at == -1) {
            return 1;
        }
        if (!this.uq.contains(Integer.valueOf(this.twf))) {
            return 2;
        }
        if (j - this.at > this.ct) {
            ahm();
            return 3;
        }
        float fAbs = Math.abs(f - this.gf);
        float fAbs2 = Math.abs(f2 - this.ra);
        if (fAbs <= this.ahm / 2.0f && fAbs2 <= this.rz / 2.0f) {
            return 0;
        }
        ahm();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.ft.kgy
    public void kgy(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.dg ? 1 : 0);
                    this.dg = false;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "evwvnBeuaMCFZdlpgwSjIHfnPoEGsmzV", "U+8jkQ+5RNSH", 224);
                }
            }
            if (com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm() != null) {
                com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm().kgy(this.fpp, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
