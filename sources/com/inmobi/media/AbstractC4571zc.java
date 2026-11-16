package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4571zc {
    /* JADX WARN: Code duplicated, block: B:8:0x0052  */
    public static final C4325qc a(ContentValues contentValues) {
        boolean z;
        contentValues.getClass();
        String asString = contentValues.getAsString("filename");
        asString.getClass();
        Long asLong = contentValues.getAsLong("saveTimestamp");
        asLong.getClass();
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        asInteger.getClass();
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        asLong2.getClass();
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        asInteger2.getClass();
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        if (asInteger3 != null) {
            z = true;
            if (asInteger3.intValue() != 1) {
                z = false;
            }
        } else {
            z = false;
        }
        return new C4325qc(asString, jLongValue, iIntValue, jLongValue2, z, iIntValue2);
    }

    public static final ContentValues a(C4325qc c4325qc) {
        c4325qc.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c4325qc.a);
        contentValues.put("saveTimestamp", Long.valueOf(c4325qc.b));
        contentValues.put("retryCount", Integer.valueOf(c4325qc.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c4325qc.d));
        contentValues.put("checkpoints", Integer.valueOf(c4325qc.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c4325qc.e ? 1 : 0));
        return contentValues;
    }
}
