package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdlk;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vb0 implements zzdjz {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public vb0(uf1 uf1Var) {
        this.a = 0;
        Context context = (Context) uf1Var.b;
        int iY = uu.y(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iY != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(iY);
            this.c = string;
            String strY = n30.y("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strY, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 2:
                ((AppEventListener) obj).onAppEvent(str2, str);
                break;
            default:
                ((zzdlk) obj).zzc(str2, str);
                break;
        }
    }

    public /* synthetic */ vb0(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public vb0(String str, String str2) {
        this.a = 1;
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }
}
