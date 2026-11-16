package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.ignite.l;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wb3 extends IIgniteServiceCallback.Stub {
    public final ArrayList c;

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        v7.k("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sd3 sd3Var = ((ha3) obj).a;
            if (sd3Var != null) {
                v7.k("%s : on one dt error", "OneDTAuthenticator");
                sd3Var.k.set(true);
                if (sd3Var.d != null) {
                    v7.l("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        v7.k("%s : property retrieved", "IgnitePropertyCallback");
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sd3 sd3Var = ((ha3) obj).a;
            if (sd3Var != null) {
                if (TextUtils.isEmpty(str)) {
                    v7.k("%s : on one dt error", "OneDTAuthenticator");
                    sd3Var.k.set(true);
                    if (sd3Var.d != null) {
                        v7.l("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    ec3 ec3Var = ec3.FAILED_INIT_ENCRYPTION;
                    v7.j(qc3.RAW_ONE_DT_ERROR, t.d, "received empty one dt from the service");
                } else {
                    uf1 uf1Var = sd3Var.e;
                    uf1Var.getClass();
                    qc3 qc3Var = qc3.ENCRYPTION_EXCEPTION;
                    try {
                        Pair pairB = ((m62) uf1Var.c).b(str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(pairB.first).put(pairB.second);
                        ((SharedPreferences) uf1Var.b).edit().putString("odt", jSONArray.toString()).apply();
                    } catch (IOException e) {
                        e = e;
                        v7.j(qc3Var, c71.a(e, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        v7.j(qc3Var, c71.a(e, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        v7.j(qc3Var, c71.a(e, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchAlgorithmException e4) {
                        e = e4;
                        v7.j(qc3Var, c71.a(e, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchPaddingException e5) {
                        e = e5;
                        v7.j(qc3Var, c71.a(e, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (Exception e6) {
                        v7.j(qc3Var, c71.a(e6, ec3.FAILED_STORE_ENCRYPTED_DATA));
                    }
                    sd3Var.f.getClass();
                    ac3 ac3VarD = k92.d(str);
                    sd3Var.g = ac3VarD;
                    l lVar = sd3Var.d;
                    if (lVar != null) {
                        v7.k("%s : setting one dt entity", "IgniteManager");
                        lVar.b = ac3VarD;
                    }
                }
            }
        }
    }

    public wb3(ha3 ha3Var) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(ha3Var);
    }
}
