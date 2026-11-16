package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class y extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final y DEFAULT_INSTANCE;
    public static final int DSIZE_BYTES_FIELD_NUMBER = 1;
    private static volatile Parser<y> PARSER;
    private int bitField0_;
    private long dsizeBytes_;

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        GeneratedMessageLite.registerDefaultInstance(y.class, yVar);
    }

    public static void a(y yVar, long j) {
        yVar.bitField0_ |= 1;
        yVar.dsizeBytes_ = j;
    }

    public static x c() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new x(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"bitField0_", "dsizeBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (y.class) {
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
}
