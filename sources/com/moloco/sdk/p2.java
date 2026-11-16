package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final p2 DEFAULT_INSTANCE;
    public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<p2> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private long elapsedTimeMillis_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        GeneratedMessageLite.registerDefaultInstance(p2.class, p2Var);
    }

    public static void a(p2 p2Var, Iterable iterable) {
        Internal.ProtobufList<String> protobufList = p2Var.tags_;
        if (!protobufList.isModifiable()) {
            p2Var.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) p2Var.tags_);
    }

    public static void b(p2 p2Var, long j) {
        p2Var.elapsedTimeMillis_ = j;
    }

    public static o2 e() {
        return (o2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p2();
            case 2:
                return new o2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (p2.class) {
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

    public static void c(p2 p2Var, String str) {
        p2Var.getClass();
        str.getClass();
        p2Var.name_ = str;
    }
}
