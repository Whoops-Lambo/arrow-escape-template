package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.mn1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleOuterClass {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Module extends GeneratedMessageLite<Module, Builder> implements ModuleOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final Module DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Module> PARSER;
        private String name_ = "";
        private ByteString config_ = ByteString.EMPTY;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {
            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getConfig() {
                return ((Module) this.instance).getConfig();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public String getName() {
                return ((Module) this.instance).getName();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getNameBytes() {
                return ((Module) this.instance).getNameBytes();
            }

            private Builder() {
                super(Module.DEFAULT_INSTANCE);
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((Module) this.instance).clearConfig();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Module) this.instance).clearName();
                return this;
            }

            public Builder setConfig(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setConfig(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Module) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(mn1 mn1Var) {
                this();
            }
        }

        static {
            Module module = new Module();
            DEFAULT_INSTANCE = module;
            GeneratedMessageLite.registerDefaultInstance(Module.class, module);
        }

        public static Module getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Module parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Module> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = mn1.a[methodToInvoke.ordinal()];
            mn1 mn1Var = null;
            switch (i) {
                case 1:
                    return new Module();
                case 2:
                    return new Builder(mn1Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"name_", "config_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Module> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Module.class) {
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

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getConfig() {
            return this.config_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        private Module() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = getDefaultInstance().getConfig();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(ByteString byteString) {
            byteString.getClass();
            this.config_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        public static Builder newBuilder(Module module) {
            return DEFAULT_INSTANCE.createBuilder(module);
        }

        public static Module parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Module parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Module parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Module parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Module parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Module parseFrom(InputStream inputStream) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Module parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ModuleOrBuilder extends MessageLiteOrBuilder {
        ByteString getConfig();

        String getName();

        ByteString getNameBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private ModuleOuterClass() {
    }
}
