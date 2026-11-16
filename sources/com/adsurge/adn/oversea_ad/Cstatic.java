package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.h50;
import defpackage.nj;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.static, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Cstatic {
    public static volatile Cpublic a;
    public static final ReentrantLock b = new ReentrantLock();
    public static final ReentrantLock c = new ReentrantLock();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static String[] a(Creturn creturn) {
        String[] strArr = {"", ""};
        String str = creturn.a;
        if (str != null && !str.isEmpty()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(Base64.decode(creturn.a, 2)));
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                strArr[0] = serialNumber != null ? serialNumber.toString(16).toUpperCase() : "";
                byte[] encoded = x509Certificate.getPublicKey() != null ? x509Certificate.getPublicKey().getEncoded() : null;
                if (encoded != null && encoded.length > 0) {
                    byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(encoded);
                    StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
                    for (byte b2 : bArrDigest) {
                        sb.append(String.format("%02x", Integer.valueOf(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)));
                    }
                    strArr[1] = sb.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Certificate[] b(byte[] bArr, Cpublic cpublic, Context context, boolean z) {
        boolean zHasSystemFeature;
        Certificate[] certificateArrA;
        Certificate[] certificateArr = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("turing_attestation_tmp_key")) {
                keyStore.deleteEntry("turing_attestation_tmp_key");
            }
            if (z || Build.VERSION.SDK_INT < 28 || context == null) {
                zHasSystemFeature = false;
            } else {
                try {
                    zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
                } catch (Throwable unused) {
                    zHasSystemFeature = false;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (zHasSystemFeature) {
                arrayList.add(new Object[]{Boolean.TRUE, "strongbox", ""});
                arrayList.add(new Object[]{Boolean.FALSE, "tee", "(sb_fallback)"});
            } else {
                arrayList.add(new Object[]{Boolean.FALSE, "tee", ""});
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Object[] objArr = (Object[]) arrayList.get(i);
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                Certificate[] certificateArr2 = certificateArr;
                boolean z2 = objArr == nj.h(1, arrayList);
                boolean z3 = !z && Build.VERSION.SDK_INT >= 31;
                try {
                    certificateArrA = a(keyStore, bArr, zBooleanValue, z3);
                } catch (Throwable th) {
                    if (z3) {
                        try {
                            keyStore.deleteEntry("turing_attestation_tmp_key");
                        } catch (Throwable unused2) {
                        }
                        try {
                            certificateArrA = a(keyStore, bArr, zBooleanValue, false);
                        } catch (Throwable th2) {
                            StringBuilder sbQ = h50.q(str, "_failed(no_dp): ");
                            sbQ.append(th2.getClass().getSimpleName());
                            sbQ.append(": ");
                            sbQ.append(th2.getMessage());
                            String string = sbQ.toString();
                            if (z2) {
                                cpublic.d = "ka_gen_failed: ".concat(string);
                                return certificateArr2;
                            }
                        }
                    } else {
                        th.getMessage();
                        if (z2) {
                            cpublic.d = "ka_gen_failed: " + th.getClass().getSimpleName() + ": " + th.getMessage();
                            return certificateArr2;
                        }
                    }
                    i = i2;
                    certificateArr = certificateArr2;
                }
                if (certificateArrA != null && certificateArrA.length > 0) {
                    return certificateArrA;
                }
                String strI = h50.i(str, "_gen_null_chain", str2);
                if (z2) {
                    cpublic.d = "ka_gen_failed: ".concat(strI);
                    return certificateArr2;
                }
                i = i2;
                certificateArr = certificateArr2;
            }
            return certificateArr;
        } catch (Throwable th3) {
            cpublic.d = "ks_init_failed: " + th3.getClass().getSimpleName() + ": " + th3.getMessage();
            return null;
        }
    }

    public static Cpublic c() {
        Context context;
        String strB;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        if (context == null || (strB = z.b(context, "115")) == null || strB.isEmpty()) {
            return null;
        }
        Cpublic cpublic = new Cpublic();
        try {
            Creturn[] creturnArrA = a(strB);
            cpublic.b = creturnArrA;
            int i = (creturnArrA == null || creturnArrA.length <= 0) ? 3 : 0;
            cpublic.a = i;
            if (i == 3) {
                cpublic.d = "empty cert chain restored from cache";
            }
        } catch (Throwable th) {
            cpublic.a = 3;
            cpublic.d = nj.r(th, new StringBuilder("cache_parse_ex: "));
        }
        if (cpublic.a == 3) {
            return null;
        }
        cpublic.c = 2;
        return cpublic;
    }

    public static Creturn[] a(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(NotificationCompat.CATEGORY_ERROR) && (jSONArrayOptJSONArray = jSONObject.optJSONArray("certs")) != null && jSONArrayOptJSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i, "");
                    Creturn creturn = new Creturn();
                    if (strOptString.startsWith("0,")) {
                        creturn.a = strOptString.substring(2);
                    } else if (strOptString.startsWith("1,")) {
                        creturn.a = null;
                    }
                    arrayList.add(creturn);
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return (Creturn[]) arrayList.toArray(new Creturn[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    public static byte[] a() {
        TuringSDK turingSDK;
        boolean z;
        synchronized (o.class) {
            turingSDK = o.J;
        }
        if (turingSDK == null) {
            z = false;
        } else {
            Sagittarius sagittarius = turingSDK.b;
            if (sagittarius == null) {
                sagittarius = o.K;
            }
            if (sagittarius.userAgreement()) {
                z = true;
            } else {
                z = false;
            }
        }
        String str = System.currentTimeMillis() + ";" + UUID.randomUUID().toString() + ";" + (z ? Build.BRAND : "PPNA") + ":" + (z ? Build.MODEL : "PPNA") + ":" + Build.DEVICE + ":" + Build.VERSION.SDK;
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return str.getBytes();
        }
    }

    public static void a(byte[] bArr, Cpublic cpublic, Context context, boolean z) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Certificate[] certificateArrB = b(bArr, cpublic, context, z);
            cpublic.e = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (certificateArrB != null && certificateArrB.length != 0) {
                Creturn[] creturnArr = new Creturn[certificateArrB.length];
                for (int i = 0; i < certificateArrB.length; i++) {
                    Creturn creturn = new Creturn();
                    creturnArr[i] = creturn;
                    try {
                        creturn.a = Base64.encodeToString(certificateArrB[i].getEncoded(), 2);
                    } catch (Throwable unused) {
                    }
                }
                cpublic.b = creturnArr;
                cpublic.a = 0;
                return;
            }
            String str = "empty cert chain, elapsed " + cpublic.e + "ms";
            if (cpublic.d == null) {
                cpublic.d = str;
            }
            cpublic.a = 3;
        } catch (Throwable th) {
            cpublic.d = th.getClass().getSimpleName() + ": " + th.getMessage();
            cpublic.a = 3;
        }
    }

    public static void a(Cpublic cpublic) {
        Context context;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            a = cpublic;
            reentrantLock.unlock();
            try {
                synchronized (Cconst.class) {
                    context = Cconst.a;
                }
                if (context != null) {
                    String strA = cpublic.a(0);
                    String str = z.b;
                    HashMap map = new HashMap();
                    map.put("115", strA);
                    z.a(context, map);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            b.unlock();
            throw th;
        }
    }

    public static Certificate[] a(KeyStore keyStore, byte[] bArr, boolean z, boolean z2) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec.Builder attestationChallenge = new KeyGenParameterSpec.Builder("turing_attestation_tmp_key", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setAttestationChallenge(bArr);
        if (z && Build.VERSION.SDK_INT >= 28) {
            attestationChallenge.setIsStrongBoxBacked(true);
        }
        if (z2 && Build.VERSION.SDK_INT >= 31) {
            attestationChallenge.setDevicePropertiesAttestationIncluded(true);
        }
        keyPairGenerator.initialize(attestationChallenge.build());
        keyPairGenerator.generateKeyPair();
        return keyStore.getCertificateChain("turing_attestation_tmp_key");
    }

    public static Cpublic b() {
        Cpublic cpublic = a;
        if (cpublic != null) {
            return cpublic;
        }
        b.lock();
        try {
            if (a != null) {
                return a;
            }
            Cpublic cpublicC = c();
            if (cpublicC != null) {
                a = cpublicC;
            }
            return cpublicC;
        } finally {
            b.unlock();
        }
    }
}
