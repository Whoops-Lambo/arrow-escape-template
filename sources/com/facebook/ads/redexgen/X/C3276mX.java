package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.Preconditions;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3276mX {
    public static byte[] A06;
    public static String[] A07 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
    public C3295mq A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C3192lA A02;
    public final AbstractC3270mR<String> A03;
    public final InterfaceC3286mh<C3318nD> A04;
    public final C3318nD A05;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mR != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
    public C3276mX(C3318nD c3318nD, AbstractC3270mR<String> abstractC3270mR, InterfaceC3286mh<C3318nD> interfaceC3286mh, C3192lA c3192lA) {
        this.A05 = c3318nD;
        this.A04 = interfaceC3286mh;
        this.A03 = abstractC3270mR;
        this.A02 = c3192lA;
    }

    private String A00() {
        String string = null;
        try {
            string = UUID.randomUUID().toString();
            InterfaceC3222le interfaceC3222leA08 = this.A02.A08();
            String eventId = this.A05.A06().toString();
            interfaceC3222leA08.AAh(eventId);
            String eventId2 = this.A05.A08();
            if (TextUtils.isEmpty(eventId2)) {
                return null;
            }
            if (this.A02.A05().AB6()) {
                StringBuilder sb = new StringBuilder();
                String eventId3 = A01(29, 15, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                StringBuilder sbAppend = sb.append(eventId3);
                String eventId4 = this.A05.A06().toString();
                StringBuilder sbAppend2 = sbAppend.append(eventId4);
                String eventId5 = A01(0, 1, 13);
                StringBuilder sbAppend3 = sbAppend2.append(eventId5);
                String eventId6 = this.A05.A09().toString();
                sbAppend3.append(eventId6).toString();
            }
            this.A04.ALa(H8.A07(this.A02, string, this.A05));
        } catch (C3295mq e) {
            this.A00 = e;
            InterfaceC3222le interfaceC3222leA09 = this.A02.A08();
            int i = AbstractC3223lf.A2N;
            C3224lg c3224lg = new C3224lg(e);
            String eventId7 = A01(44, 15, 76);
            interfaceC3222leA09.ABz(eventId7, i, c3224lg);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public void A05(String str) {
        if (this.A00 == null) {
            AbstractC3270mR<String> abstractC3270mR = this.A03;
            if (A07[0].length() == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "shQ0u07cw4p4b8Uc";
            strArr[6] = "JjSvAUnNTB5Zbg5c";
            abstractC3270mR.A02(str);
            return;
        }
        AbstractC3270mR<String> abstractC3270mR2 = this.A03;
        String str2 = (String) Preconditions.checkNotNull(this.A00.getMessage(), A01(1, 28, 90));
        String[] strArr2 = A07;
        if (strArr2[5].length() != strArr2[6].length()) {
            abstractC3270mR2.A01(0, str2);
        } else {
            A07[4] = "N66E9jsqBkZQOUjdGlNkK47WGUg";
            abstractC3270mR2.A01(0, str2);
        }
    }

    public final /* synthetic */ void A04() {
        final String strA00 = A00();
        this.A01.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.mV
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A05(strA00);
            }
        });
    }

    public final void A06(Executor executor) {
        executor.execute(new Runnable() { // from class: com.facebook.ads.redexgen.X.mW
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A04();
            }
        });
    }
}
