package androidx.datastore.preferences.protobuf;

import defpackage.d;
import defpackage.e32;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.a.get(new ExtensionRegistryLite.ObjectIntPair(i, messageLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objValueOf;
        Object objE;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.b;
        MessageLite messageLite = generatedExtension.a;
        extensionDescriptor.getClass();
        WireFormat.FieldType fieldType = extensionDescriptor.a;
        if (fieldType == WireFormat.FieldType.p) {
            reader.z();
            extensionDescriptor.getClass();
            throw null;
        }
        switch (fieldType.ordinal()) {
            case 0:
                objValueOf = Double.valueOf(reader.readDouble());
                break;
            case 1:
                objValueOf = Float.valueOf(reader.readFloat());
                break;
            case 2:
                objValueOf = Long.valueOf(reader.r());
                break;
            case 3:
                objValueOf = Long.valueOf(reader.i());
                break;
            case 4:
                objValueOf = Integer.valueOf(reader.z());
                break;
            case 5:
                objValueOf = Long.valueOf(reader.s());
                break;
            case 6:
                objValueOf = Integer.valueOf(reader.C());
                break;
            case 7:
                objValueOf = Boolean.valueOf(reader.u());
                break;
            case 8:
                objValueOf = reader.N();
                break;
            case 9:
                extensionDescriptor.getClass();
                Object objE2 = fieldSet.e(extensionDescriptor);
                if (objE2 instanceof GeneratedMessageLite) {
                    Protobuf protobuf = Protobuf.c;
                    protobuf.getClass();
                    Schema schemaA = protobuf.a(objE2.getClass());
                    if (!((GeneratedMessageLite) objE2).m()) {
                        Object objC = schemaA.c();
                        schemaA.a(objC, objE2);
                        fieldSet.l(extensionDescriptor, objC);
                        objE2 = objC;
                    }
                    reader.M(objE2, schemaA, extensionRegistryLite);
                    return obj3;
                }
                objValueOf = reader.K(messageLite.getClass(), extensionRegistryLite);
                break;
            case 10:
                extensionDescriptor.getClass();
                Object objE3 = fieldSet.e(extensionDescriptor);
                if (objE3 instanceof GeneratedMessageLite) {
                    Protobuf protobuf2 = Protobuf.c;
                    protobuf2.getClass();
                    Schema schemaA2 = protobuf2.a(objE3.getClass());
                    if (!((GeneratedMessageLite) objE3).m()) {
                        Object objC2 = schemaA2.c();
                        schemaA2.a(objC2, objE3);
                        fieldSet.l(extensionDescriptor, objC2);
                        objE3 = objC2;
                    }
                    reader.I(objE3, schemaA2, extensionRegistryLite);
                    return obj3;
                }
                objValueOf = reader.G(messageLite.getClass(), extensionRegistryLite);
                break;
            case 11:
                objValueOf = reader.g();
                break;
            case 12:
                objValueOf = Integer.valueOf(reader.c());
                break;
            case 13:
                e32.i("Shouldn't reach here.");
                return null;
            case 14:
                objValueOf = Integer.valueOf(reader.E());
                break;
            case 15:
                objValueOf = Long.valueOf(reader.b());
                break;
            case 16:
                objValueOf = Integer.valueOf(reader.e());
                break;
            case 17:
                objValueOf = Long.valueOf(reader.D());
                break;
            default:
                objValueOf = null;
                break;
        }
        extensionDescriptor.getClass();
        int iOrdinal = extensionDescriptor.a.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objE = fieldSet.e(extensionDescriptor)) != null) {
            GeneratedMessageLite.Builder builder = ((MessageLite) objE).toBuilder();
            MessageLite messageLite2 = (MessageLite) objValueOf;
            if (!builder.a.getClass().isInstance(messageLite2)) {
                d.r("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            builder.j((GeneratedMessageLite) ((AbstractMessageLite) messageLite2));
            objValueOf = builder.buildPartial();
        }
        fieldSet.l(extensionDescriptor, objValueOf);
        return obj3;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.l(generatedExtension.b, reader.G(generatedExtension.a.getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.Builder builderNewBuilderForType = generatedExtension.a.newBuilderForType();
        CodedInputStream codedInputStreamZ = byteString.z();
        builderNewBuilderForType.g();
        try {
            Protobuf protobuf = Protobuf.c;
            GeneratedMessageLite generatedMessageLite = builderNewBuilderForType.b;
            protobuf.getClass();
            Schema schemaA = protobuf.a(generatedMessageLite.getClass());
            GeneratedMessageLite generatedMessageLite2 = builderNewBuilderForType.b;
            CodedInputStreamReader codedInputStreamReader = codedInputStreamZ.b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStreamZ);
            }
            schemaA.h(generatedMessageLite2, codedInputStreamReader, extensionRegistryLite);
            fieldSet.l(generatedExtension.b, builderNewBuilderForType.buildPartial());
            codedInputStreamZ.a(0);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
        return 1001;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        extensionDescriptor.getClass();
        switch (extensionDescriptor.a.ordinal()) {
            case 0:
                writer.E(1001, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                writer.M(1001, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                writer.J(1001, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                writer.e(1001, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.g(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                writer.p(1001, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                writer.c(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                writer.q(1001, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                writer.d(1001, (String) entry.getValue());
                break;
            case 9:
                writer.D(1001, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                break;
            case 10:
                writer.j(1001, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                break;
            case 11:
                writer.h(1001, (ByteString) entry.getValue());
                break;
            case 12:
                writer.n(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.g(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                writer.r(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.A(1001, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                writer.P(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                writer.l(1001, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
