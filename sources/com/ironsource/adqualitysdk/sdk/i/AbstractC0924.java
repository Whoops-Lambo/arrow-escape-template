package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0924 {

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static Field f2481;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static Field f2482;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static Field f2483;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static Field f2484;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static Object f2485;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static Class f2486;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2498 = StringFog.decrypt("MMYoJFp2meYFwSAl\n", "cahMVjUf/bM=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2497 = StringFog.decrypt("V9YApdcGK6p28B2S3gEtsw==\n", "Oplu5rtvSME=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f2496 = StringFog.decrypt("c7/YDfa5bApSmcUt/KJqEA==\n", "HvC2WZnMD2I=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2495 = StringFog.decrypt("IY6IQAjp\n", "TNjhJX+ajzA=\n");

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2494 = StringFog.decrypt("s7ZmzDGNofiss2HZKg==\n", "3voPv0Xoz50=\n");

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2493 = StringFog.decrypt("cSR/XYB8fYR4Im4=\n", "FkELFO4PCeU=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2492 = StringFog.decrypt("Xv3MC616b81V7A==\n", "OZi4T8gcDrg=\n");

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2491 = StringFog.decrypt("cPQfE7j/hUZ0yAU/uPyY\n", "HbtxWtaZ6go=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2490 = StringFog.decrypt("ynDyTg4t6KbCS/ViDwzxudNa8mgT\n", "pz+cDWFAmMo=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2489 = StringFog.decrypt("d1JBAMeHHtloeEsc3JEa3XR4XQ==\n", "Gh0vULXibrg=\n");

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2488 = StringFog.decrypt("sxP2B5EMDNuxMeg4kR0C1Lcv7DGaDBU=\n", "3lyYVPRpZ5g=\n");

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2487 = StringFog.decrypt("1xuCBpH1FqnbL4IQ\n", "ulbnYviURsU=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static View.OnTouchListener m685(View view) {
        try {
            Object objM687 = m687(view);
            if (objM687 == null) {
                return null;
            }
            Class<?> cls = objM687.getClass();
            synchronized (AbstractC0388.class) {
                try {
                    if (f2481 == null) {
                        f2481 = m688(cls, f2496);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnTouchListener) f2481.get(objM687);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static View.OnClickListener m686(View view) {
        try {
            Object objM687 = m687(view);
            if (objM687 == null) {
                return null;
            }
            Class<?> cls = objM687.getClass();
            synchronized (AbstractC0388.class) {
                try {
                    if (f2482 == null) {
                        f2482 = m688(cls, f2497);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) f2482.get(objM687);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m689() {
        try {
            if (f2486 == null || f2485 == null) {
                Class<?> cls = Class.forName(StringFog.decrypt("c+G8uvBFZWZk5r2/sXtoJnbgr4X+QmAvd/2fpPBOYCQ=\n", "Eo/YyJ8sAUg=\n"));
                f2486 = cls;
                f2485 = cls.getMethod(f2493, null).invoke(null, null);
            }
            Class cls2 = f2486;
            Object obj = f2485;
            if (f2484 == null) {
                Field declaredField = cls2.getDeclaredField(f2495);
                f2484 = declaredField;
                declaredField.setAccessible(true);
            }
            Object obj2 = f2484.get(obj);
            if (obj2 instanceof List) {
                return new ArrayList((List) obj2);
            }
            return obj2 instanceof View[] ? new ArrayList(Arrays.asList((View[]) obj2)) : new ArrayList();
        } catch (Throwable th) {
            AbstractC0509.m489(f2498, StringFog.decrypt("w08lBIY0657yST4FkzTbkuhZOBy5deKa4VglS4J96Yz1B3c=\n", "hj1Xa/QUjPs=\n") + th.getLocalizedMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m690(MediaPlayer mediaPlayer, InterfaceC0372 interfaceC0372) {
        try {
            Field fieldM688 = m688(MediaPlayer.class, f2491);
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldM688.get(mediaPlayer);
            if (onInfoListener instanceof C0370) {
                return;
            }
            fieldM688.set(mediaPlayer, new C0370(onInfoListener, interfaceC0372));
        } catch (Exception e) {
            AbstractC1290.m905(f2498, StringFog.decrypt("6PeblIoDn1at94yLlEKVXcLrpJ6cSpdx4+OGt5FQgl3j4Js=\n", "jYXp+/gj9jg=\n"), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m691(MediaPlayer mediaPlayer, InterfaceC0383 interfaceC0383) {
        try {
            Field fieldM688 = m688(MediaPlayer.class, f2490);
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM688.get(mediaPlayer);
            if (onCompletionListener instanceof C0381) {
                return;
            }
            fieldM688.set(mediaPlayer, new C0381(onCompletionListener, interfaceC0383));
        } catch (Exception e) {
            AbstractC1290.m905(f2498, StringFog.decrypt("ZMDZB4RWqSshwM4YmhejIE7c5g2SH6EGbt/bBJMCqSpv/sIbghOuIHM=\n", "AbKraPZ2wEU=\n"), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m693(MediaPlayer mediaPlayer, InterfaceC1297 interfaceC1297) {
        try {
            Field fieldM688 = m688(MediaPlayer.class, f2489);
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM688.get(mediaPlayer);
            if (onPreparedListener instanceof C1274) {
                return;
            }
            fieldM688.set(mediaPlayer, new C1274(onPreparedListener, interfaceC1297));
        } catch (Exception e) {
            AbstractC1290.m905(f2498, StringFog.decrypt("hF3iD/dCwdDBXfUQ6QPL265B3QXhC8nuk0rgAfcHzPKIXOQF6wfa\n", "4S+QYIViqL4=\n"), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m692(MediaPlayer mediaPlayer, InterfaceC1254 interfaceC1254) {
        try {
            Field fieldM688 = m688(MediaPlayer.class, f2488);
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM688.get(mediaPlayer);
            if (onSeekCompleteListener instanceof C1248) {
                return;
            }
            fieldM688.set(mediaPlayer, new C1248(onSeekCompleteListener, interfaceC1254));
        } catch (Exception e) {
            AbstractC1290.m905(f2498, StringFog.decrypt("qSWiaFf1CpTsJbV3SbQAn4M5g2JAviCVoSe8YlGwL5O/I7VpQKc=\n", "zFfQByXVY/o=\n"), (Throwable) e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m687(View view) {
        try {
            synchronized (AbstractC0388.class) {
                try {
                    if (f2483 == null) {
                        f2483 = m688(View.class, f2494);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f2483.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field m688(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            AbstractC1290.m905(f2498, StringFog.decrypt("k+CQZHOv38zW9Yd/RerVzpfgh29H5tPOkg==\n", "9pLiCwGPtqI=\n"), (Throwable) e, false);
            return null;
        }
    }
}
