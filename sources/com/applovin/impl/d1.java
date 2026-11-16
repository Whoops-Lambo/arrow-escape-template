package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d1 extends Activity {
    private e1 a;
    private FrameLayout b;
    private ListView c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements w2.a {
        final /* synthetic */ c a;

        /* JADX INFO: renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C0160a implements d.b {
            final /* synthetic */ n2 a;

            public C0160a(n2 n2Var) {
                this.a = n2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((r1) d1.this.a.d().get(this.a.a()), d1.this.a.e());
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            if (n2Var.b() != e1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.a, new C0160a(n2Var));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(android.R.id.content);
        this.c = (ListView) findViewById(R.id.listView);
        k8.a(this.b, com.applovin.impl.sdk.l.F0);
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.a;
        if (e1Var != null) {
            e1Var.a((w2.a) null);
            this.a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        e1 e1Var = this.a;
        if (e1Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((ListAdapter) e1Var);
        e1 e1Var2 = this.a;
        if (e1Var2 != null && !e1Var2.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        e1 e1Var3 = this.a;
        if (e1Var3 != null && e1Var3.f()) {
            a(R.string.applovin_creative_debugger_no_ads_text);
        }
    }

    public void a(e1 e1Var, c cVar) {
        this.a = e1Var;
        e1Var.a(new a(cVar));
    }
}
