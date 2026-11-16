package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
    public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
    private static final k DEFAULT_INSTANCE;
    public static final int FONT_SCALE_FIELD_NUMBER = 4;
    private static volatile Parser<k> PARSER = null;
    public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
    private boolean accessibilityCaptioningEnabled_;
    private boolean accessibilityLargePointerIcon_;
    private int bitField0_;
    private float fontScale_;
    private boolean reduceBrightColorsActivated_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
    }

    public static void a(k kVar, boolean z) {
        kVar.bitField0_ |= 1;
        kVar.accessibilityCaptioningEnabled_ = z;
    }

    public static void b(k kVar, boolean z) {
        kVar.bitField0_ |= 2;
        kVar.accessibilityLargePointerIcon_ = z;
    }

    public static void c(k kVar, float f) {
        kVar.bitField0_ |= 8;
        kVar.fontScale_ = f;
    }

    public static void d(k kVar, boolean z) {
        kVar.bitField0_ |= 4;
        kVar.reduceBrightColorsActivated_ = z;
    }

    public static j f() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "accessibilityCaptioningEnabled_", "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<k> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (k.class) {
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
