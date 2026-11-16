package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.az1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class PrivacyUpdateResponseOuterClass {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class PrivacyUpdateResponse extends GeneratedMessageLite<PrivacyUpdateResponse, Builder> implements PrivacyUpdateResponseOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateResponse DEFAULT_INSTANCE;
        private static volatile Parser<PrivacyUpdateResponse> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_ = ByteString.EMPTY;
        private int version_;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder extends GeneratedMessageLite.Builder<PrivacyUpdateResponse, Builder> implements PrivacyUpdateResponseOrBuilder {
            @Override // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponseOrBuilder
            public ByteString getContent() {
                return ((PrivacyUpdateResponse) this.instance).getContent();
            }

            @Override // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponseOrBuilder
            public int getVersion() {
                return ((PrivacyUpdateResponse) this.instance).getVersion();
            }

            private Builder() {
                super(PrivacyUpdateResponse.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((PrivacyUpdateResponse) this.instance).clearContent();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((PrivacyUpdateResponse) this.instance).clearVersion();
                return this;
            }

            public Builder setContent(ByteString byteString) {
                copyOnWrite();
                ((PrivacyUpdateResponse) this.instance).setContent(byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((PrivacyUpdateResponse) this.instance).setVersion(i);
                return this;
            }

            public /* synthetic */ Builder(az1 az1Var) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        static {
            PrivacyUpdateResponse privacyUpdateResponse = new PrivacyUpdateResponse();
            DEFAULT_INSTANCE = privacyUpdateResponse;
            GeneratedMessageLite.registerDefaultInstance(PrivacyUpdateResponse.class, privacyUpdateResponse);
        }

        public static PrivacyUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PrivacyUpdateResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = az1.a[methodToInvoke.ordinal()];
            az1 az1Var = null;
            switch (i) {
                case 1:
                    return new PrivacyUpdateResponse();
                case 2:
                    return new Builder(az1Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PrivacyUpdateResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PrivacyUpdateResponse.class) {
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

        @Override // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponseOrBuilder
        public ByteString getContent() {
            return this.content_;
        }

        @Override // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponseOrBuilder
        public int getVersion() {
            return this.version_;
        }

        private PrivacyUpdateResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(ByteString byteString) {
            byteString.getClass();
            this.content_ = byteString;
        }

        public static Builder newBuilder(PrivacyUpdateResponse privacyUpdateResponse) {
            return DEFAULT_INSTANCE.createBuilder(privacyUpdateResponse);
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface PrivacyUpdateResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        int getVersion();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private PrivacyUpdateResponseOuterClass() {
    }
}
