package com.bytedance.sdk.component.adexpress.dynamic.kgy;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ahm.kus;
import com.bytedance.sdk.component.adexpress.ahm.nu;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.bytedance.sdk.component.adexpress.ahm.uq;
import com.bytedance.sdk.component.adexpress.ahm.yo;
import com.bytedance.sdk.component.adexpress.dynamic.ct.fi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.muf;
import com.bytedance.sdk.component.adexpress.dynamic.uq.noq;
import com.bytedance.sdk.component.utils.gf;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy implements nu, uq<DynamicRootView> {
    private fi ahm;
    private com.bytedance.sdk.component.adexpress.ahm.fi ct;
    private AtomicBoolean fi = new AtomicBoolean(false);
    private DynamicRootView kgy;
    private twf noq;
    private Context rz;
    private yo uq;
    private ScheduledFuture<?> yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0204kgy implements Runnable {
        private int ahm;

        public RunnableC0204kgy(int i) {
            this.ahm = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ahm == 2) {
                kgy.this.kgy.callBackRenderFail(kgy.this.ahm instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        float fYo;
        float fNoq;
        List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> listNu;
        if (fiVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> listNu2 = fiVar.nu();
        if (listNu2 == null || listNu2.size() <= 0) {
            fYo = 0.0f;
        } else {
            fYo = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2 : listNu2) {
                if (fiVar2.yo() > fiVar.yo() - fiVar2.gf() || (listNu = fiVar2.nu()) == null || listNu.size() <= 0) {
                    fNoq = 0.0f;
                } else {
                    fNoq = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar3 : listNu) {
                        if (fiVar3.ra().ahm().equals("logo-union")) {
                            fNoq = fiVar3.ra().noq();
                            fYo = ((fiVar.yo() + (-fNoq)) - fiVar2.yo()) + fiVar2.ra().ct().xxq();
                        }
                    }
                }
                ahm(fiVar2);
                if (fNoq <= -15.0f) {
                    fiVar2.noq(fiVar2.gf() - fNoq);
                    fiVar2.uq(fiVar2.yo() + fNoq);
                    for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar4 : fiVar2.nu()) {
                        fiVar4.uq(fiVar4.yo() - fNoq);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVarAt = fiVar.at();
        if (fiVarAt == null) {
            return;
        }
        float fNoq2 = fiVar.noq() - fiVarAt.noq();
        float fYo2 = fiVar.yo() - fiVarAt.yo();
        fiVar.rz(fNoq2);
        fiVar.uq(fYo2);
        if (fYo > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fiVar.uq(fiVar.yo() - fYo);
            fiVar.noq(fiVar.gf() + fYo);
            for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar5 : fiVar.nu()) {
                fiVar5.uq(fiVar5.yo() + fYo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi() {
        try {
            ScheduledFuture<?> scheduledFuture = this.yo;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.yo.cancel(false);
            this.yo = null;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6MkUusjgQ==", "f/cjlA61avWFRNNYng==", "WO8jlgawW8KOTtJPuBitLXT7ObMWqHzVhX7WToc=", 381);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void noq() {
        this.noq.ct().ahm(rz());
        JSONObject jSONObjectRz = this.noq.rz();
        boolean zKgy = com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.kgy(jSONObjectRz);
        fi fiVar = this.ahm;
        if (zKgy) {
            fiVar.kgy(new com.bytedance.sdk.component.adexpress.dynamic.noq.ahm() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.noq.ahm
                public void kgy(final com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2) {
                    kgy.this.fi();
                    kgy.this.noq.ct().rz(kgy.this.rz());
                    kgy.this.kgy(fiVar2);
                    kgy.this.ahm(fiVar2);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        kgy.this.rz(fiVar2);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                kgy.this.rz(fiVar2);
                            }
                        });
                    }
                    if (kgy.this.kgy == null || fiVar2 == null) {
                        return;
                    }
                    kgy.this.kgy.setBgColor(fiVar2.kgy());
                    kgy.this.kgy.setBgMaterialCenterCalcColor(fiVar2.ahm());
                }
            });
            this.ahm.kgy(this.noq);
            return;
        }
        int i = fiVar instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113;
        DynamicRootView dynamicRootView = this.kgy;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectRz == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rz(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        if (fiVar == null) {
            this.kgy.callBackRenderFail(this.ahm instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113, "layoutUnit is null");
            return;
        }
        this.noq.ct().uq(rz());
        try {
            this.kgy.render(fiVar, rz());
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6MkUusjgQ==", "f/cjlA61avWFRNNYng==", "SesjkQauRcaZRcJJox+QKUn9KIcgvWXLgkvUVg==", 288);
            int i = this.ahm instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.kgy.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    private boolean yo() {
        DynamicRootView dynamicRootView = this.kgy;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    public void kgy(yo yoVar) {
        this.uq = yoVar;
        int iNoq = this.noq.noq();
        if (iNoq < 0) {
            this.kgy.callBackRenderFail(this.ahm instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(iNoq)));
            return;
        }
        this.yo = com.bytedance.sdk.component.adexpress.uq.uq.kgy(new RunnableC0204kgy(2), iNoq, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() != Looper.myLooper() || this.noq.gf() > 0) {
            gf.ahm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.noq();
                }
            }, this.noq.gf());
        } else {
            noq();
        }
    }

    public kgy(Context context, boolean z, fi fiVar, twf twfVar, com.bytedance.sdk.component.adexpress.dynamic.noq.kgy kgyVar) {
        this.rz = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, z, twfVar, kgyVar);
        this.kgy = dynamicRootView;
        this.ahm = fiVar;
        this.noq = twfVar;
        dynamicRootView.setRenderListener(this);
        this.noq = twfVar;
    }

    public DynamicRootView uq() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    public int rz() {
        return this.ahm instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> listNu;
        if (fiVar == null || (listNu = fiVar.nu()) == null || listNu.size() <= 0) {
            return;
        }
        Collections.sort(listNu, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar3) {
                noq noqVarCt = fiVar2.ra().ct();
                noq noqVarCt2 = fiVar3.ra().ct();
                if (noqVarCt != null && noqVarCt2 != null) {
                    if (noqVarCt.fxy() >= noqVarCt2.fxy()) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar2 : listNu) {
            if (fiVar2 != null) {
                kgy(fiVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public DynamicRootView ct() {
        return uq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void kgy(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                kgy(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof muf) {
            ((muf) view).ahm();
        }
    }

    public void kgy(com.bytedance.sdk.component.adexpress.ahm.fi fiVar) {
        this.ct = fiVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.nu
    public void kgy(kus kusVar) {
        if (this.fi.get()) {
            return;
        }
        this.fi.set(true);
        if (kusVar.uq() && yo()) {
            this.kgy.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.uq.kgy(ct(), kusVar);
            return;
        }
        this.uq.kgy(kusVar.at(), kusVar.nu());
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.nu
    public void kgy(View view, int i, com.bytedance.sdk.component.adexpress.rz rzVar) {
        com.bytedance.sdk.component.adexpress.ahm.fi fiVar = this.ct;
        if (fiVar != null) {
            fiVar.kgy(view, i, rzVar);
        }
    }

    public void ahm() {
        kgy(ct());
    }
}
