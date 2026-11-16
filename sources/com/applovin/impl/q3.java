package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import defpackage.kf3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q3 extends r3 {
    private s3 b;
    private DataSetObserver c;
    private FrameLayout d;
    private ListView e;
    private com.applovin.impl.a f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            q3.this.a();
            q3 q3Var = q3.this;
            q3Var.b((Context) q3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements w2.a {
        final /* synthetic */ com.applovin.impl.c a;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class a implements com.applovin.impl.d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(q3.this.b.u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.q3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C0170b implements com.applovin.impl.d.b {
            public C0170b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(q3.this.b.d(), q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class c implements com.applovin.impl.d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(q3.this.b.d(), q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class d implements com.applovin.impl.d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(q3.this.b.f(), false, q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class e implements com.applovin.impl.d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(q3.this.b.k(), q3.this.b.x(), q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class f implements com.applovin.impl.d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(q3.this.b.w(), q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class g implements com.applovin.impl.d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(q3.this.b.p(), true, q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class h implements com.applovin.impl.d.b {
            public h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(q3.this.b.u().G().getTrackedAxonEvents(), q3.this.b.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class i implements com.applovin.impl.d.b {
            final /* synthetic */ v2 a;

            public i(v2 v2Var) {
                this.a = v2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((e4) this.a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.a = cVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            int iB = n2Var.b();
            if (iB == s3.e.APP_INFO.ordinal()) {
                u7.a(v2Var.c(), v2Var.b(), q3.this);
                return;
            }
            if (iB == s3.e.MAX.ordinal()) {
                if (q3.this.b.a(v2Var)) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a());
                    return;
                } else {
                    u7.a(v2Var.c(), v2Var.b(), q3.this);
                    return;
                }
            }
            if (iB == s3.e.PRIVACY.ordinal()) {
                if (n2Var.a() == s3.d.CMP.ordinal()) {
                    if (StringUtils.isValidString(q3.this.b.u().t0().j())) {
                        com.applovin.impl.d.a(q3.this, MaxDebuggerTcfInfoListActivity.class, this.a, new C0170b());
                        return;
                    } else {
                        u7.a(v2Var.c(), v2Var.b(), q3.this);
                        return;
                    }
                }
                if (n2Var.a() == s3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                    return;
                }
                return;
            }
            if (iB == s3.e.ADS.ordinal()) {
                if (n2Var.a() == s3.b.AD_UNITS.ordinal()) {
                    int size = q3.this.b.f().size();
                    q3 q3Var = q3.this;
                    if (size > 0) {
                        com.applovin.impl.d.a(q3Var, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                        return;
                    } else {
                        u7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", q3Var);
                        return;
                    }
                }
                if (n2Var.a() == s3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (q3.this.b.k().size() <= 0 && q3.this.b.x().size() <= 0) {
                        u7.a("Complete Integrations", "Please complete integrations in order to access this.", q3.this);
                        return;
                    } else if (q3.this.b.u().u0().c()) {
                        u7.a("Restart Required", v2Var.b(), q3.this);
                        return;
                    } else {
                        com.applovin.impl.d.a(q3.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                        return;
                    }
                }
                if (n2Var.a() == s3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    boolean zC = q3.this.b.u().u0().c();
                    q3 q3Var2 = q3.this;
                    if (!zC) {
                        q3Var2.getSdk().u0().a();
                        u7.a("Restart Required", v2Var.b(), q3.this);
                        return;
                    }
                    int size2 = q3Var2.b.w().size();
                    q3 q3Var3 = q3.this;
                    if (size2 > 0) {
                        com.applovin.impl.d.a(q3Var3, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
                        return;
                    } else {
                        u7.a("Complete Integrations", "Please complete integrations in order to access this.", q3Var3);
                        return;
                    }
                }
                if (n2Var.a() == s3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                    return;
                }
                return;
            }
            if (iB == s3.e.EVENTS.ordinal()) {
                com.applovin.impl.d.a(q3.this, MaxDebuggerAxonEventsListActivity.class, this.a, new h());
            } else if ((iB == s3.e.INCOMPLETE_NETWORKS.ordinal() || iB == s3.e.COMPLETED_NETWORKS.ordinal()) && (v2Var instanceof e4)) {
                com.applovin.impl.d.a(q3.this, MaxDebuggerDetailActivity.class, this.a, new i(v2Var));
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    @Override // com.applovin.impl.r3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.d = (FrameLayout) findViewById(android.R.id.content);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f;
        if (aVar != null) {
            aVar.b();
            this.d.removeView(this.f);
            this.f = null;
        }
    }

    private void b() {
        s3 s3Var = this.b;
        if (s3Var == null) {
            return;
        }
        String strQ = s3Var.q();
        if (TextUtils.isEmpty(strQ)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strQ);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.r3
    public com.applovin.impl.sdk.l getSdk() {
        s3 s3Var = this.b;
        if (s3Var != null) {
            return s3Var.u();
        }
        return null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    public void setListAdapter(s3 s3Var, c cVar) {
        DataSetObserver dataSetObserver;
        s3 s3Var2 = this.b;
        if (s3Var2 != null && (dataSetObserver = this.c) != null) {
            s3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.b = s3Var;
        this.c = new a();
        b((Context) this);
        this.b.registerDataSetObserver(this.c);
        this.b.a(new b(cVar));
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, android.R.attr.progressBarStyleLarge);
        this.f = aVar;
        aVar.setColor(-3355444);
        this.d.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.d.bringChildToFront(this.f);
        this.f.a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s3 s3Var = this.b;
        if (s3Var != null) {
            s3Var.unregisterDataSetObserver(this.c);
            this.b.a((w2.a) null);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        s3 s3Var = this.b;
        if (s3Var != null && s3Var.z()) {
            this.b.c();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        s3 s3Var = this.b;
        if (s3Var != null && !s3Var.z()) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        u7.a(this.b.i(), this.b.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.b.h()) || this.b.y()) {
            return;
        }
        this.b.b(true);
        runOnUiThread(new kf3(7, this, context));
    }
}
