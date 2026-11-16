package androidx.datastore.preferences.protobuf;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class WireFormat {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FieldType {
        public static final FieldType c;
        public static final FieldType d;
        public static final FieldType e;
        public static final FieldType f;
        public static final FieldType g;
        public static final FieldType h;
        public static final FieldType i;
        public static final FieldType j;
        public static final FieldType k;
        public static final FieldType l;
        public static final FieldType m;
        public static final FieldType n;
        public static final FieldType o;
        public static final FieldType p;
        public static final FieldType q;
        public static final FieldType r;
        public static final FieldType s;
        public static final FieldType t;
        public static final /* synthetic */ FieldType[] u;
        public final JavaType a;
        public final int b;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final enum AnonymousClass1 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final enum AnonymousClass2 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final enum AnonymousClass3 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public final enum AnonymousClass4 extends FieldType {
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            c = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            d = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            e = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            g = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            h = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            i = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            j = fieldType8;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, JavaType.STRING, 2);
            k = anonymousClass1;
            JavaType javaType3 = JavaType.MESSAGE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, javaType3, 3);
            l = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("MESSAGE", 10, javaType3, 2);
            m = anonymousClass3;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4("BYTES", 11, JavaType.BYTE_STRING, 2);
            n = anonymousClass4;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            o = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            p = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            q = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            r = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            s = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            t = fieldType14;
            u = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) u.clone();
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            super(str, i2);
            this.a = javaType;
            this.b = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Utf8Validation {
        /* JADX INFO: Fake field, exist only in values array */
        EF2 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF7 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF12 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FieldType.values().length];
            a = iArr;
            try {
                iArr[FieldType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FieldType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[FieldType.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[FieldType.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[FieldType.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[FieldType.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[FieldType.n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[FieldType.o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[FieldType.q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[FieldType.r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[FieldType.s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[FieldType.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[FieldType.k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[FieldType.l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[FieldType.m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.b),
        ENUM(null),
        MESSAGE(null);

        public final Object a;

        JavaType(Serializable serializable) {
            this.a = serializable;
        }
    }
}
