package defpackage;

import com.facebook.appevents.p;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhnr;
import com.google.android.gms.internal.ads.zzhqk;
import com.google.android.gms.internal.ads.zzicx;
import com.google.android.gms.internal.fido.zzfm;
import com.google.android.gms.internal.measurement.zzabt;
import com.google.android.gms.internal.measurement.zzrn;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaos;
import com.google.android.gms.internal.p002firebaseauthapi.zzhk;
import com.google.android.gms.internal.p002firebaseauthapi.zznt;
import com.google.android.gms.internal.p002firebaseauthapi.zzqm;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gl0 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ gl0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        Provider provider = null;
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return new zzabt();
            case 2:
                gl0 gl0Var = zzaos.a;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
            case 3:
                return ByteBuffer.allocate(32);
            case 4:
                return 0L;
            case 5:
                return new zzfm();
            case 6:
                try {
                    return (Cipher) zzzr.b.a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    p.g(e);
                    return null;
                }
            case 7:
                try {
                    return (Cipher) zzicx.b.a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e2) {
                    p.g(e2);
                    return null;
                }
            case 8:
                try {
                    Cipher cipher = (Cipher) zzicx.b.a.a("AES/GCM-SIV/NoPadding");
                    if (zzhlx.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e3) {
                    p.g(e3);
                    return null;
                }
            case 9:
                gl0 gl0Var2 = zzhqk.a;
                Provider providerA = zzhnr.a();
                if (providerA == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerA);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 10:
                try {
                    return (Cipher) zzicx.b.a.a("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e4) {
                    p.g(e4);
                    return null;
                }
            case 11:
                try {
                    return (Cipher) zzicx.b.a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e5) {
                    p.g(e5);
                    return null;
                }
            case 12:
                try {
                    return (Cipher) zzicx.b.a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e6) {
                    p.g(e6);
                    return null;
                }
            case 13:
                try {
                    Cipher cipher2 = (Cipher) zzzr.b.a.a("AES/GCM-SIV/NoPadding");
                    if (zzhk.c(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e7) {
                    p.g(e7);
                    return null;
                }
            case 14:
                gl0 gl0Var3 = zzqm.a;
                Provider providerA2 = zznt.a();
                if (providerA2 == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom2 = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom2 = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom2 = SecureRandom.getInstance("SHA1PRNG", providerA2);
                    } catch (GeneralSecurityException unused4) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused5) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom2 = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused6) {
                                secureRandom2 = new SecureRandom();
                            }
                        } else {
                            secureRandom2 = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom2.nextLong();
                return secureRandom2;
            case 15:
                try {
                    return (Cipher) zzzr.b.a.a("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e8) {
                    p.g(e8);
                    return null;
                }
            case 16:
                zzrn.a(Thread.currentThread());
                zzwq zzwqVar = new zzwq();
                zzwqVar.a = false;
                zzwqVar.b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = zzvy.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, zzwqVar);
                    break;
                }
                return zzwqVar;
            case 17:
                return new Random();
            case 18:
                try {
                    return (Cipher) zzzr.b.a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e9) {
                    p.g(e9);
                    return null;
                }
            case 19:
                try {
                    return (Cipher) zzzr.b.a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    p.g(e10);
                    return null;
                }
            default:
                try {
                    return (Cipher) zzzr.b.a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e11) {
                    p.g(e11);
                    return null;
                }
        }
    }
}
