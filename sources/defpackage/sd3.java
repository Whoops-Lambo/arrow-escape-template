package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.ignite.h;
import com.fyber.inneractive.sdk.ignite.k;
import com.fyber.inneractive.sdk.ignite.l;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sd3 extends gd3 {
    public m62 c;
    public l d;
    public final uf1 e;
    public final k92 f;
    public ac3 g;
    public ha3 h;
    public final boolean i;
    public final boolean j;
    public final AtomicBoolean k;

    @Override // defpackage.gd3, defpackage.ga3
    public final void destroy() {
        this.d = null;
        m62 m62Var = this.c;
        if (m62Var != null) {
            ka3 ka3Var = (ka3) m62Var.c;
            if (ka3Var != null && ka3Var.b) {
                ((Context) m62Var.b).unregisterReceiver(ka3Var);
                ((ka3) m62Var.c).b = false;
            }
            ka3 ka3Var2 = (ka3) m62Var.c;
            if (ka3Var2 != null) {
                ka3Var2.a = null;
                m62Var.c = null;
            }
            m62Var.d = null;
            m62Var.b = null;
            m62Var.e = null;
            this.c = null;
        }
        ha3 ha3Var = this.h;
        if (ha3Var != null) {
            wb3 wb3Var = ha3Var.b;
            if (wb3Var != null) {
                wb3Var.c.clear();
                ha3Var.b = null;
            }
            ha3Var.c = null;
            ha3Var.a = null;
            this.h = null;
        }
        this.b = null;
        this.a.destroy();
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final void b() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strC;
        v7 v7Var = v7.f;
        qc3 qc3Var = qc3.ENCRYPTION_EXCEPTION;
        ac3 ac3Var = this.g;
        AtomicBoolean atomicBoolean = this.k;
        if (ac3Var == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            k kVar = (k) v7Var.b;
            if (kVar != null) {
                kVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            uf1 uf1Var = this.e;
            uf1Var.getClass();
            m62 m62Var = (m62) uf1Var.c;
            try {
                m62Var.d();
            } catch (IOException e) {
                e = e;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e3) {
                e = e3;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e4) {
                e = e4;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e6) {
                e = e6;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e7) {
                e = e7;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e8) {
                e = e8;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e9) {
                e = e9;
                v7.j(qc3Var, c71.a(e, ec3.FAILED_INIT_ENCRYPTION));
            } catch (Exception e10) {
                v7.j(qc3Var, c71.a(e10, ec3.FAILED_INIT_ENCRYPTION));
            }
            String string = ((SharedPreferences) uf1Var.b).getString("odt", null);
            if (TextUtils.isEmpty(string)) {
                strC = "";
            } else {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    strC = m62Var.c(jSONArray.getString(1), Base64.decode(jSONArray.getString(0), 0));
                } catch (IOException e11) {
                    e = e11;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (InvalidAlgorithmParameterException e12) {
                    e = e12;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (InvalidKeyException e13) {
                    e = e13;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (NoSuchPaddingException e15) {
                    e = e15;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (JSONException e16) {
                    e = e16;
                    v7.j(qc3Var, c71.a(e, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                } catch (Exception e17) {
                    v7.j(qc3Var, c71.a(e17, ec3.FAILED_EXTRACT_ENCRYPTED_DATA));
                    strC = "";
                }
            }
            this.f.getClass();
            ac3 ac3VarD = k92.d(strC);
            this.g = ac3VarD;
            if (ac3VarD.b > System.currentTimeMillis() / 1000) {
                v7.k("%s : One DT resolved from cache", "OneDTAuthenticator");
                ac3 ac3Var2 = this.g;
                l lVar = this.d;
                if (lVar != null) {
                    v7.k("%s : setting one dt entity", "IgniteManager");
                    lVar.b = ac3Var2;
                }
            } else {
                atomicBoolean.set(true);
            }
        }
        boolean z = this.j;
        if (z && this.c == null) {
            v7.l("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.i && !atomicBoolean.get()) {
            if (z) {
                this.c.d();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            k kVar2 = (k) v7Var.b;
            if (kVar2 != null) {
                kVar2.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.a.b();
        }
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final void c(ComponentName componentName, IBinder iBinder) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        gb gbVar;
        ga3 ga3Var = this.a;
        boolean zJ = ga3Var.j();
        if (!zJ && (gbVar = this.b) != null) {
            gbVar.onOdtUnsupported();
        }
        if (this.c != null && ga3Var.j() && this.j) {
            this.c.d();
        }
        if (zJ || this.i) {
            super.c(componentName, iBinder);
        }
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final String d() {
        ga3 ga3Var = this.a;
        if (ga3Var instanceof gd3) {
            return ga3Var.d();
        }
        return null;
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final String i() {
        ga3 ga3Var = this.a;
        if (ga3Var instanceof gd3) {
            return ga3Var.i();
        }
        return null;
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final boolean j() {
        return this.a.j();
    }

    public final void l() {
        ga3 ga3Var = this.a;
        IIgniteServiceAPI iIgniteServiceAPIK = ga3Var.k();
        qc3 qc3Var = qc3.ONE_DT_REQUEST_ERROR;
        if (iIgniteServiceAPIK == null) {
            v7.l("%s : service is unavailable", "OneDTAuthenticator");
            ec3 ec3Var = ec3.FAILED_INIT_ENCRYPTION;
            v7.j(qc3Var, t.d, "Ignite service unavailable");
            return;
        }
        if (this.h == null) {
            ha3 ha3Var = new ha3();
            ha3Var.a = this;
            ha3Var.b = new wb3(ha3Var);
            ha3Var.c = iIgniteServiceAPIK;
            this.h = ha3Var;
        }
        if (TextUtils.isEmpty(ga3Var.e())) {
            ec3 ec3Var2 = ec3.FAILED_INIT_ENCRYPTION;
            v7.j(qc3Var, t.d, "Invalid session token");
            v7.l("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        ha3 ha3Var2 = this.h;
        String strE = ga3Var.e();
        ha3Var2.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            ha3Var2.c.getProperty("onedtid", bundle, new Bundle(), ha3Var2.b);
        } catch (RemoteException e) {
            v7.h(qc3Var, e);
            v7.l("%s : request failed : %s", "OneDTPropertyHandler", e.toString());
        }
    }

    public sd3(ga3 ga3Var, boolean z, boolean z2, h hVar, l lVar) {
        super(ga3Var, hVar);
        this.i = false;
        this.j = false;
        this.k = new AtomicBoolean(false);
        this.d = lVar;
        this.i = z;
        this.f = new k92(16);
        this.e = new uf1(ga3Var.g(), 29);
        this.j = z2;
        if (z2) {
            Context contextG = ga3Var.g();
            m62 m62Var = new m62(13);
            m62Var.b = contextG.getApplicationContext();
            ka3 ka3Var = new ka3();
            ka3Var.b = false;
            ka3Var.a = m62Var;
            m62Var.c = ka3Var;
            m62Var.d = this;
            m62Var.e = this;
            this.c = m62Var;
        }
    }

    @Override // defpackage.gd3, defpackage.ga3
    public final void c(String str) {
        super.c(str);
        ga3 ga3Var = this.a;
        if (ga3Var.h()) {
            AtomicBoolean atomicBoolean = this.k;
            if (atomicBoolean.get() && ga3Var.j()) {
                atomicBoolean.set(false);
                l();
            }
        }
    }
}
