package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final p DEFAULT_INSTANCE;
    public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
    private static volatile Parser<p> PARSER = null;
    public static final int VOL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int muteSwitch_;
    private int vol_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        GeneratedMessageLite.registerDefaultInstance(p.class, pVar);
    }

    public static void b(p pVar, int i) {
        pVar.bitField0_ |= 2;
        pVar.vol_ = i;
    }

    public static n d() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "muteSwitch_", "vol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (p.class) {
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

    public static void a(p pVar, o oVar) {
        pVar.getClass();
        pVar.muteSwitch_ = oVar.getNumber();
        pVar.bitField0_ |= 1;
    }
}
