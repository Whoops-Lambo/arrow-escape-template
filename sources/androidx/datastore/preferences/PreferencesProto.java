package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferencesProto {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.b;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class PreferencesDefaultEntryHolder {
            public static final MapEntryLite a = new MapEntryLite(WireFormat.FieldType.k, WireFormat.FieldType.m, Value.C());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.r(PreferenceMap.class, preferenceMap);
        }

        public static MapFieldLite s(PreferenceMap preferenceMap) {
            MapFieldLite<String, Value> mapFieldLite = preferenceMap.preferences_;
            if (!mapFieldLite.a) {
                preferenceMap.preferences_ = mapFieldLite.g();
            }
            return preferenceMap.preferences_;
        }

        public static Builder u() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.e, null));
        }

        public static PreferenceMap v(InputStream inputStream) throws InvalidProtocolBufferException {
            GeneratedMessageLite generatedMessageLiteQ = GeneratedMessageLite.q(DEFAULT_INSTANCE, CodedInputStream.f(inputStream), ExtensionRegistryLite.a());
            if (GeneratedMessageLite.l(generatedMessageLiteQ, true)) {
                return (PreferenceMap) generatedMessageLiteQ;
            }
            throw new UninitializedMessageException(generatedMessageLiteQ).d().r(generatedMessageLiteQ);
        }

        public final Map t() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.a});
                case 3:
                    return new PreferenceMap();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser == null) {
                        synchronized (PreferenceMap.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return defaultInstanceBasedParser;
                    }
                    return parser;
                default:
                    d.c();
                    return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.i();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.r(StringSet.class, stringSet);
        }

        public static void s(StringSet stringSet, Set set) {
            Internal.ProtobufList<String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                int size = protobufList.size();
                stringSet.strings_ = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            }
            AbstractMessageLite.c(set, stringSet.strings_);
        }

        public static StringSet t() {
            return DEFAULT_INSTANCE;
        }

        public static Builder v() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.e, null));
        }

        public final Internal.ProtobufList u() {
            return this.strings_;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new StringSet();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<StringSet> parser = PARSER;
                    if (parser == null) {
                        synchronized (StringSet.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return defaultInstanceBasedParser;
                    }
                    return parser;
                default:
                    d.c();
                    return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class ValueCase {
            public static final ValueCase a;
            public static final ValueCase b;
            public static final ValueCase c;
            public static final ValueCase d;
            public static final ValueCase e;
            public static final ValueCase f;
            public static final ValueCase g;
            public static final ValueCase h;
            public static final ValueCase i;
            public static final /* synthetic */ ValueCase[] j;

            static {
                ValueCase valueCase = new ValueCase("BOOLEAN", 0);
                a = valueCase;
                ValueCase valueCase2 = new ValueCase("FLOAT", 1);
                b = valueCase2;
                ValueCase valueCase3 = new ValueCase("INTEGER", 2);
                c = valueCase3;
                ValueCase valueCase4 = new ValueCase("LONG", 3);
                d = valueCase4;
                ValueCase valueCase5 = new ValueCase("STRING", 4);
                e = valueCase5;
                ValueCase valueCase6 = new ValueCase("STRING_SET", 5);
                f = valueCase6;
                ValueCase valueCase7 = new ValueCase("DOUBLE", 6);
                g = valueCase7;
                ValueCase valueCase8 = new ValueCase("BYTES", 7);
                h = valueCase8;
                ValueCase valueCase9 = new ValueCase("VALUE_NOT_SET", 8);
                i = valueCase9;
                j = new ValueCase[]{valueCase, valueCase2, valueCase3, valueCase4, valueCase5, valueCase6, valueCase7, valueCase8, valueCase9};
            }

            public static ValueCase valueOf(String str) {
                return (ValueCase) Enum.valueOf(ValueCase.class, str);
            }

            public static ValueCase[] values() {
                return (ValueCase[]) j.clone();
            }
        }

        public static void s(Value value, long j) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j);
        }

        public static void v(Value value, double d) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d);
        }

        public static void x(Value value, boolean z) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z);
        }

        public static void y(Value value, float f) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f);
        }

        public static void z(Value value, int i) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i);
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.r(Value.class, value);
        }

        public static Value C() {
            return DEFAULT_INSTANCE;
        }

        public static Builder K() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.e, null));
        }

        public final boolean A() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final ByteString B() {
            return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.b;
        }

        public final double D() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public final float E() {
            return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final int F() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final long G() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public final String H() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public final StringSet I() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.t();
        }

        public final ValueCase J() {
            switch (this.valueCase_) {
                case 0:
                    return ValueCase.i;
                case 1:
                    return ValueCase.a;
                case 2:
                    return ValueCase.b;
                case 3:
                    return ValueCase.c;
                case 4:
                    return ValueCase.d;
                case 5:
                    return ValueCase.e;
                case 6:
                    return ValueCase.f;
                case 7:
                    return ValueCase.g;
                case 8:
                    return ValueCase.h;
                default:
                    return null;
            }
        }

        public static void t(Value value, String str) {
            value.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static void u(Value value, StringSet stringSet) {
            value.getClass();
            value.value_ = stringSet;
            value.valueCase_ = 6;
        }

        public static void w(Value value, ByteString byteString) {
            value.getClass();
            value.valueCase_ = 8;
            value.value_ = byteString;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", StringSet.class});
                case 3:
                    return new Value();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Value> parser = PARSER;
                    if (parser == null) {
                        synchronized (Value.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return defaultInstanceBasedParser;
                    }
                    return parser;
                default:
                    d.c();
                    return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
