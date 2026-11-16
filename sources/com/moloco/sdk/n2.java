package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class n2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final n2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<n2> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private int count_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        GeneratedMessageLite.registerDefaultInstance(n2.class, n2Var);
    }

    public static void a(n2 n2Var, Iterable iterable) {
        Internal.ProtobufList<String> protobufList = n2Var.tags_;
        if (!protobufList.isModifiable()) {
            n2Var.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) n2Var.tags_);
    }

    public static void b(n2 n2Var, int i) {
        n2Var.count_ = i;
    }

    public static m2 e() {
        return (m2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n2();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (n2.class) {
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

    public static void c(n2 n2Var, String str) {
        n2Var.getClass();
        str.getClass();
        n2Var.name_ = str;
    }
}
