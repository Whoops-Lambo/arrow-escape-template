package com.moloco.sdk.internal.ilrd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m1;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cm2;
import defpackage.dn;
import defpackage.dy;
import defpackage.f93;
import defpackage.li2;
import defpackage.qa;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.x23;
import io.p071bidmachine.media3.common.util.x;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p implements io.p071bidmachine.media3.extractor.text.d {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public synchronized void a(long j, wr0 wr0Var) throws Throwable {
        Throwable th;
        try {
            try {
                li2 li2Var = (li2) this.b;
                if (li2Var != null) {
                    try {
                        if (li2Var.isActive()) {
                            li2Var.cancel(null);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + ((String) this.d) + " cancelled", null, false, 12, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                try {
                    this.b = tb5.t((dn) this.a, null, null, new x23(this, j, wr0Var, (dy) null, 1), 3);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public com.moloco.sdk.internal.services.bidtoken.providers.o d() {
        IlrdEventsRepository ilrdEventsRepository = (IlrdEventsRepository) this.c;
        synchronized (ilrdEventsRepository) {
            ilrdEventsRepository.c();
            ilrdEventsRepository.m.a(ilrdEventsRepository.d, new c(ilrdEventsRepository, null, 0));
        }
        j jVar = ilrdEventsRepository.q;
        if (jVar != null) {
            g gVarC = jVar.c();
            return new com.moloco.sdk.internal.services.bidtoken.providers.o(jVar.d(), jVar.d, gVarC.a, gVarC.b, gVarC.c, gVarC.d, gVarC.e, gVarC.f);
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public void e() {
        AudioManager audioManager = (AudioManager) this.a;
        if (audioManager != null && ((AtomicBoolean) this.c).compareAndSet(true, false)) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    audioManager.abandonAudioFocusRequest(qa.l(((cm2) this.e).getValue()));
                } else {
                    audioManager.abandonAudioFocus((io.p071bidmachine.util.a) this.b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean f() {
        Integer numValueOf;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        AudioManager audioManager = (AudioManager) this.a;
        if (audioManager == null) {
            return false;
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return true;
        }
        try {
            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT >= 26 ? audioManager.requestAudioFocus(qa.l(((cm2) this.e).getValue())) : audioManager.requestAudioFocus((io.p071bidmachine.util.a) this.b, 3, 2));
        } catch (Throwable unused) {
            numValueOf = null;
        }
        boolean z = (numValueOf != null ? numValueOf.intValue() : 0) == 1;
        if (!z) {
            atomicBoolean.set(false);
        }
        return z;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public List getCues(long j) {
        io.p071bidmachine.media3.extractor.text.ttml.c cVar = (io.p071bidmachine.media3.extractor.text.ttml.c) this.a;
        Map map = (Map) this.d;
        HashMap map2 = (HashMap) this.b;
        HashMap map3 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.h, treeMap);
        cVar.h(j, map, map2, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                io.p071bidmachine.media3.extractor.text.ttml.f fVar = (io.p071bidmachine.media3.extractor.text.ttml.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new io.p071bidmachine.media3.common.text.b(null, null, null, bitmapDecodeByteArray, fVar.c, 0, fVar.e, fVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f, fVar.g, false, -16777216, fVar.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            io.p071bidmachine.media3.extractor.text.ttml.f fVar2 = (io.p071bidmachine.media3.extractor.text.ttml.f) map2.get(entry.getKey());
            fVar2.getClass();
            io.p071bidmachine.media3.common.text.a aVar = (io.p071bidmachine.media3.common.text.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (io.p071bidmachine.media3.extractor.text.ttml.a aVar2 : (io.p071bidmachine.media3.extractor.text.ttml.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), io.p071bidmachine.media3.extractor.text.ttml.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = fVar2.c;
            int i10 = fVar2.d;
            aVar.e = f;
            aVar.f = i10;
            aVar.g = fVar2.e;
            aVar.h = fVar2.b;
            aVar.l = fVar2.f;
            float f2 = fVar2.i;
            int i11 = fVar2.h;
            aVar.k = f2;
            aVar.j = i11;
            aVar.p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public long getEventTime(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public int getEventTimeCount() {
        return ((long[]) this.c).length;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.c;
        int iA = x.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    public p(int i) throws NoSuchAlgorithmException {
        switch (i) {
            case 3:
                this.a = new cm2(new f93(22));
                this.c = new cm2(new f93(23));
                cm2 cm2Var = new cm2(new f93(24));
                this.d = new cm2(new f93(25));
                KeyGenerator keyGenerator = KeyGenerator.getInstance((String) cm2Var.getValue());
                keyGenerator.init(256);
                this.b = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), (String) cm2Var.getValue());
                this.e = new cm2(new f93(26));
                break;
            default:
                this.a = null;
                this.c = null;
                this.d = null;
                this.b = null;
                this.e = null;
                break;
        }
    }

    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        gVar.getClass();
        List list = (List) this.c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.h((m1) this.e, list, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h) this.b).q(), (com.moloco.sdk.internal.services.events.c) this.a, gVar);
            this.c = null;
        }
    }

    public byte[] c(String str) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        str.getClass();
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.b;
        secretKeySpec.getEncoded().getClass();
        Cipher cipher = Cipher.getInstance((String) ((cm2) this.c).getValue());
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance((String) ((cm2) this.a).getValue()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        publicKeyGeneratePublic.getClass();
        cipher.init(1, publicKeyGeneratePublic);
        byte[] bArrDoFinal = cipher.doFinal(secretKeySpec.getEncoded());
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    public p(dn dnVar, com.moloco.sdk.internal.services.h hVar, String str) {
        hVar.getClass();
        this.a = dnVar;
        this.c = hVar;
        this.d = str;
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        this.e = com.facebook.appevents.h.c("HH:mm:ss", timeZone);
    }

    public p(io.p071bidmachine.media3.extractor.text.ttml.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = cVar;
        this.b = map2;
        this.e = map3;
        this.d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }
}
