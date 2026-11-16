package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 extends r3 {
    private k3 b;
    private ListView c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements w2.a {
        final /* synthetic */ i3 a;

        /* JADX INFO: renamed from: com.applovin.impl.j3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C0163a implements d.b {
            public C0163a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.a);
            }
        }

        public a(i3 i3Var) {
            this.a = i3Var;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            if (n2Var.b() == k3.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.l lVarO = this.a.o();
                i3.b bVarY = this.a.y();
                if (j3.this.b.a(n2Var)) {
                    if (i3.b.READY == bVarY) {
                        d.a(j3.this, MaxDebuggerMultiAdActivity.class, lVarO.e(), new C0163a());
                        return;
                    } else if (i3.b.DISABLED == bVarY) {
                        lVarO.u0().a();
                        u7.a(v2Var.c(), v2Var.b(), j3.this);
                        return;
                    } else {
                        u7.a(v2Var.c(), v2Var.b(), j3.this);
                        return;
                    }
                }
                u7.a(v2Var.c(), v2Var.b(), j3.this);
                return;
            }
            u7.a(v2Var.c(), v2Var.b(), j3.this);
        }
    }

    @Override // com.applovin.impl.r3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.c = listView;
        listView.setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.r3
    public com.applovin.impl.sdk.l getSdk() {
        k3 k3Var = this.b;
        if (k3Var != null) {
            return k3Var.h().o();
        }
        return null;
    }

    public j3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(i3 i3Var) {
        setTitle(i3Var.g());
        k3 k3Var = new k3(i3Var, this);
        this.b = k3Var;
        k3Var.a(new a(i3Var));
    }

    @Override // com.applovin.impl.r3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.b.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.b.k();
            this.b.c();
        }
    }
}
