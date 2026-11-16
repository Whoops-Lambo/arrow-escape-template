package androidx.datastore.preferences.protobuf;

import defpackage.d;
import defpackage.e32;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@CheckReturnValue
final class Protobuf {
    public static final Protobuf c = new Protobuf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ManifestSchemaFactory a = new ManifestSchemaFactory();

    public final Schema a(Class cls) {
        ExtensionSchema extensionSchema;
        Schema schemaY;
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.a;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.a) != null && !cls2.isAssignableFrom(cls)) {
            d.r("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        MessageInfo messageInfoA = manifestSchemaFactory.a.a(cls);
        if (messageInfoA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                schemaY = new MessageSetSchema(SchemaUtil.c, ExtensionSchemas.a, messageInfoA.b());
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.b;
                ExtensionSchema extensionSchema2 = ExtensionSchemas.b;
                if (extensionSchema2 == null) {
                    e32.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                schemaY = new MessageSetSchema(unknownFieldSchema, extensionSchema2, messageInfoA.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            NewInstanceSchemaLite newInstanceSchemaLite = NewInstanceSchemas.b;
            ListFieldSchemaLite listFieldSchemaLite = ListFieldSchemas.b;
            UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = SchemaUtil.c;
            ExtensionSchemaLite extensionSchemaLite = messageInfoA.getSyntax().ordinal() != 1 ? ExtensionSchemas.a : null;
            MapFieldSchemaLite mapFieldSchemaLite = MapFieldSchemas.b;
            if (!(messageInfoA instanceof RawMessageInfo)) {
                int[] iArr = MessageSchema.p;
                throw null;
            }
            schemaY = MessageSchema.y((RawMessageInfo) messageInfoA, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSetLiteSchema, extensionSchemaLite, mapFieldSchemaLite);
        } else {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.a;
            ListFieldSchema listFieldSchema = ListFieldSchemas.a;
            UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.b;
            if (messageInfoA.getSyntax().ordinal() != 1) {
                ExtensionSchema extensionSchema3 = ExtensionSchemas.b;
                if (extensionSchema3 == null) {
                    e32.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                extensionSchema = extensionSchema3;
            } else {
                extensionSchema = null;
            }
            MapFieldSchema mapFieldSchema = MapFieldSchemas.a;
            if (!(messageInfoA instanceof RawMessageInfo)) {
                int[] iArr2 = MessageSchema.p;
                throw null;
            }
            schemaY = MessageSchema.y((RawMessageInfo) messageInfoA, newInstanceSchema, listFieldSchema, unknownFieldSchema2, extensionSchema, mapFieldSchema);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, schemaY);
        return schema2 != null ? schema2 : schemaY;
    }
}
