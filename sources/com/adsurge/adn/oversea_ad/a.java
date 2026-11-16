package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final String a = CanisMinor.a(CanisMinor.E0);

    public static Teazle a() {
        String name;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Method method = Class.forName(CanisMinor.a(CanisMinor.F0)).getMethod(CanisMinor.a(CanisMinor.G0), null);
            method.setAccessible(true);
            method.invoke(null, null);
            Provider[] providers = Security.getProviders();
            if (providers == null) {
                return Teazle.a(-1201);
            }
            int length = providers.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    name = providers[i].getName();
                    if (name != null && name.startsWith(a)) {
                        break;
                    }
                    i++;
                } else {
                    name = null;
                    break;
                }
            }
            if (TextUtils.isEmpty(name)) {
                return Teazle.a(-1202);
            }
            boolean z = name.split("\\.").length > 1;
            try {
                KeyStore keyStore = KeyStore.getInstance(name);
                keyStore.load(null);
                int iMyUid = Process.myUid();
                try {
                    if (keyStore.getCertificate("dddd" + iMyUid) == null) {
                        try {
                            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", name);
                            try {
                                try {
                                    keyPairGenerator.initialize(Apricot.a("dddd" + iMyUid + CanisMinor.a(CanisMinor.H0), z ? 16 : 4).a("SHA-256").b("PSS").a());
                                    try {
                                        keyPairGenerator.generateKeyPair();
                                    } catch (Throwable unused) {
                                    }
                                } catch (InvalidAlgorithmParameterException unused2) {
                                    return Teazle.a(-1701);
                                }
                            } catch (ClassNotFoundException unused3) {
                                return Teazle.a(-1601);
                            } catch (IllegalAccessException unused4) {
                                return Teazle.a(-1603);
                            } catch (InstantiationException unused5) {
                                return Teazle.a(-1605);
                            } catch (NoSuchMethodException unused6) {
                                return Teazle.a(-1602);
                            } catch (InvocationTargetException unused7) {
                                return Teazle.a(-1604);
                            }
                        } catch (NoSuchAlgorithmException unused8) {
                            return Teazle.a(-1501);
                        } catch (NoSuchProviderException unused9) {
                            return Teazle.a(-1502);
                        }
                    }
                } catch (Throwable unused10) {
                }
                if (z) {
                    try {
                        return new Teazle(0, 100, System.currentTimeMillis() - jCurrentTimeMillis, new Warden(keyStore.getCertificateChain("dddd" + iMyUid)).c, -1, -2);
                    } catch (KeyStoreException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Key key = keyStore.getKey("dddd" + iMyUid, CanisMinor.a(CanisMinor.I0).toCharArray());
                        if (key != null) {
                            Wild wildA = a(key.getEncoded());
                            int i2 = wildA.a;
                            if (i2 != 0) {
                                return Teazle.a(i2);
                            }
                            Warden warden = wildA.b;
                            if (a0.f.a("s_t_d_entry", false)) {
                                try {
                                    keyStore.deleteEntry("dddd" + iMyUid);
                                } catch (Throwable unused11) {
                                }
                            }
                            return new Teazle(0, 100, System.currentTimeMillis() - jCurrentTimeMillis, warden.c, -1, -2);
                        }
                    } catch (KeyStoreException unused12) {
                        return Teazle.a(-1801);
                    } catch (NoSuchAlgorithmException unused13) {
                        return Teazle.a(-1802);
                    } catch (UnrecoverableKeyException unused14) {
                        return Teazle.a(-1803);
                    }
                }
                return Teazle.a(-1901);
            } catch (IOException unused15) {
                return Teazle.a(-1303);
            } catch (KeyStoreException unused16) {
                return Teazle.a(-1301);
            } catch (NoSuchAlgorithmException unused17) {
                return Teazle.a(-1304);
            } catch (CertificateException unused18) {
                return Teazle.a(-1302);
            }
        } catch (ClassNotFoundException unused19) {
            return Teazle.a(-1104);
        } catch (IllegalAccessException unused20) {
            return Teazle.a(-1103);
        } catch (NoSuchMethodException unused21) {
            return Teazle.a(-1102);
        } catch (InvocationTargetException unused22) {
            return Teazle.a(-1101);
        }
    }

    public static Teazle a(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent();
        intent.setAction(CanisMinor.a(CanisMinor.J0));
        intent.setPackage(CanisMinor.a(CanisMinor.K0));
        Object obj = new Object();
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(new Teazle(-2001, 200, -1L, "", -1, -1));
        White white = new White(atomicReference, jCurrentTimeMillis, obj);
        if (context.getApplicationContext().bindService(intent, white, 1)) {
            synchronized (obj) {
                try {
                    obj.wait(5000L);
                } catch (InterruptedException unused) {
                }
            }
        } else {
            atomicReference.set(new Teazle(-2002, 200, -1L, "", -1, -1));
        }
        try {
            context.getApplicationContext().unbindService(white);
        } catch (Throwable unused2) {
        }
        return (Teazle) atomicReference.get();
    }

    public static Wild a(byte[] bArr) {
        if (bArr == null) {
            return new Wild(-3001, null);
        }
        if (bArr.length < 4) {
            return new Wild(-3001, null);
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (bArr2[i2] & 255) << (i2 * 8);
        }
        if (i > 1048576) {
            return new Wild(-3003, null);
        }
        byte[] bArr3 = new byte[i];
        int i3 = i + 4;
        if (bArr.length < i3) {
            return new Wild(-3004, null);
        }
        System.arraycopy(bArr, 4, bArr3, 0, i);
        Warden warden = new Warden(new String(bArr3));
        int length = bArr.length - i3;
        if (length != 0) {
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i3, bArr4, 0, length);
            Base64.encodeToString(bArr4, 2);
            return new Wild(0, warden);
        }
        return new Wild(-3005, null);
    }
}
