package com.adsurge.adn.p049p;

import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        UNKNOWN,
        FRONT_CARD_WITHOUT_TIP,
        FRONT_CARD_WITH_TIP,
        END_CARD;

        public b b() {
            int i = a.a[ordinal()];
            if (i == 1) {
                return FRONT_CARD_WITHOUT_TIP;
            }
            if (i != 2) {
                return (i == 3 || i == 4) ? END_CARD : this;
            }
            return FRONT_CARD_WITH_TIP;
        }
    }

    void a();

    void a(b bVar, boolean z);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.FRONT_CARD_WITHOUT_TIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.FRONT_CARD_WITH_TIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.END_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    default void a(q qVar, h hVar, boolean z) {
        if (z) {
            qVar.b(hVar.e());
        } else {
            qVar.a(hVar.e());
        }
    }

    default boolean a(String str) {
        return false;
    }

    default void a(q qVar, h hVar) {
        a(qVar, hVar, false);
    }
}
