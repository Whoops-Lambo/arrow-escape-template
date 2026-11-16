package com.bytedance.adsdk.kgy.ahm.ct;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.at;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.ct;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.fi;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.fpp;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.gf;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.kus;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.noq;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.nu;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.twf;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.um;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.uq;
import com.bytedance.adsdk.kgy.ahm.ahm.kgy.xh;
import com.bytedance.adsdk.kgy.ahm.uq.rz;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm {

    /* JADX INFO: renamed from: com.bytedance.adsdk.kgy.ahm.ct.ahm$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[rz.values().length];
            kgy = iArr;
            try {
                iArr[rz.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[rz.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[rz.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[rz.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[rz.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[rz.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kgy[rz.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kgy[rz.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kgy[rz.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                kgy[rz.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                kgy[rz.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                kgy[rz.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                kgy[rz.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> ahm(List<com.bytedance.adsdk.kgy.ahm.ahm.kgy> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.kgy.ahm.ahm.kgy> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar : linkedList) {
                if (!linkedList2.isEmpty() && rz.kgy(((com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList2.peekLast()).kgy()) && ((rz) ((com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList2.peekLast()).kgy()).ahm() == i2) {
                    com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar2 = (com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList2.pollLast();
                    com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar3 = (com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList2.pollLast();
                    if (rz.kgy(kgyVar3.kgy()) || rz.kgy(kgyVar.kgy())) {
                        d.r(str.substring(0, i));
                        return null;
                    }
                    linkedList2.addLast(kgy(kgyVar3, kgyVar2, kgyVar));
                } else {
                    linkedList2.addLast(kgyVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.kgy.ahm.ahm.kgy kgy(com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar, com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar2, com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar3) {
        xh nuVar;
        switch (AnonymousClass1.kgy[((rz) kgyVar2.kgy()).ordinal()]) {
            case 1:
                nuVar = new nu();
                break;
            case 2:
                nuVar = new um();
                break;
            case 3:
                nuVar = new com.bytedance.adsdk.kgy.ahm.ahm.kgy.kgy();
                break;
            case 4:
                nuVar = new twf();
                break;
            case 5:
                nuVar = new at();
                break;
            case 6:
                nuVar = new uq();
                break;
            case 7:
                nuVar = new kus();
                break;
            case 8:
                nuVar = new noq();
                break;
            case 9:
                nuVar = new gf();
                break;
            case 10:
                nuVar = new ct();
                break;
            case 11:
                nuVar = new fi();
                break;
            case 12:
                nuVar = new com.bytedance.adsdk.kgy.ahm.ahm.kgy.ahm();
                break;
            case 13:
                nuVar = new com.bytedance.adsdk.kgy.ahm.ahm.kgy.rz();
                break;
            default:
                throw new UnsupportedOperationException(kgyVar2.kgy().toString());
        }
        nuVar.kgy(kgyVar);
        nuVar.ahm(kgyVar3);
        return nuVar;
    }

    private static void rz(List<com.bytedance.adsdk.kgy.ahm.ahm.kgy> list, String str, int i) {
        Iterator<com.bytedance.adsdk.kgy.ahm.ahm.kgy> it = list.iterator();
        while (it.hasNext()) {
            if (com.bytedance.adsdk.kgy.ahm.uq.uq.kgy(it.next().kgy())) {
                d.r(str.substring(0, i));
                return;
            }
        }
    }

    private static Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> kgy(Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList.peekLast()).kgy() == rz.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar2 = (com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList.pollLast();
                if (((com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList.pollLast()).kgy() == rz.QUESTION) {
                    com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar3 = (com.bytedance.adsdk.kgy.ahm.ahm.kgy) linkedList.pollLast();
                    fpp fppVar = new fpp();
                    fppVar.kgy(kgyVar3);
                    fppVar.ahm(kgyVar2);
                    fppVar.rz(kgyVar);
                    linkedList.addLast(fppVar);
                } else {
                    y.b();
                    return null;
                }
            } else {
                linkedList.addLast(kgyVar);
            }
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.kgy.ahm.ahm.kgy kgy(List<com.bytedance.adsdk.kgy.ahm.ahm.kgy> list, String str, int i) {
        rz(list, str, i);
        Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> dequeKgy = kgy(ahm(list, str, i));
        if (dequeKgy.size() == 1) {
            return dequeKgy.getFirst();
        }
        y.b();
        return null;
    }

    public static boolean kgy(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }
}
