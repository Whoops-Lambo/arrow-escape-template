package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzhu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b94 extends ie4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b94(l23 l23Var, Activity activity, zzcm zzcmVar) {
        super((zzez) l23Var.b, true);
        this.e = 3;
        this.g = activity;
        this.h = zzcmVar;
        this.f = l23Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ie4
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        zzcp zzcpVarAsInterface = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.g;
                    Preconditions.checkNotNull(context);
                    String strA = zzhu.a(context);
                    Preconditions.checkNotNull(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = zzhu.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    zzez zzezVar = (zzez) this.f;
                    byte b = boolValueOf == null || !boolValueOf.booleanValue();
                    zzezVar.getClass();
                    try {
                        zzcpVarAsInterface = zzco.asInterface(DynamiteModule.c(context, b != false ? DynamiteModule.d : DynamiteModule.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule.LoadingException e) {
                        zzezVar.b(e, true, false);
                    }
                    zzezVar.g = zzcpVarAsInterface;
                    if (zzezVar.g != null) {
                        int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j = iMax;
                        zzezVar.h = j;
                        zzdb zzdbVar = new zzdb(161000L, j, z, (Bundle) this.h, zzhu.a(context));
                        byte b2 = zzezVar.h >= 169;
                        zzcp zzcpVar = zzezVar.g;
                        if (b2 != true) {
                            ((zzcp) Preconditions.checkNotNull(zzcpVar)).initialize(new ObjectWrapper(context), zzdbVar, this.a);
                        } else {
                            ((zzcp) Preconditions.checkNotNull(zzcpVar)).initializeWithElapsedTime(new ObjectWrapper(context), zzdbVar, this.a, this.b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((zzez) this.f).b(e2, true, false);
                    return;
                }
                break;
            case 1:
                ((zzcp) Preconditions.checkNotNull(((zzez) this.f).g)).getMaxUserProperties((String) this.g, (zzcm) this.h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                ((zzcp) Preconditions.checkNotNull(((zzez) ((l23) this.f).b).g)).onActivityCreatedByScionActivityInfo(zzdd.d((Activity) this.g), bundle, this.b);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(((zzez) ((l23) this.f).b).g)).onActivitySaveInstanceStateByScionActivityInfo(zzdd.d((Activity) this.g), (zzcm) this.h, this.b);
                break;
        }
    }

    @Override // defpackage.ie4
    public void c() {
        switch (this.e) {
            case 1:
                ((zzcm) this.h).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b94(zzez zzezVar, Object obj, Object obj2, int i) {
        super(zzezVar, true);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b94(l23 l23Var, Bundle bundle, Activity activity) {
        super((zzez) l23Var.b, true);
        this.e = 2;
        this.h = bundle;
        this.g = activity;
        this.f = l23Var;
    }
}
