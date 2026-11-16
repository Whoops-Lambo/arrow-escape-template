package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
    private static final s DEFAULT_INSTANCE;
    public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
    public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<s> PARSER;
    private int batteryStatus_;
    private int bitField0_;
    private boolean lowPowMode_;
    private int maxBatteryLevel_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        GeneratedMessageLite.registerDefaultInstance(s.class, sVar);
    }

    public static void b(s sVar, boolean z) {
        sVar.bitField0_ |= 4;
        sVar.lowPowMode_ = z;
    }

    public static void c(s sVar, int i) {
        sVar.bitField0_ |= 1;
        sVar.maxBatteryLevel_ = i;
    }

    public static r e() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<s> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (s.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            default:
                defpackage.d.c();
            case 7:
                return null;
        }
    }

    public static void a(s sVar, q qVar) {
        sVar.getClass();
        sVar.batteryStatus_ = qVar.getNumber();
        sVar.bitField0_ |= 2;
    }
}
