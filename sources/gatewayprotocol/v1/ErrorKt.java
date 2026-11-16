package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ErrorKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorKt {

    @NotNull
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl;", "", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;)V", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "_build", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Laz2;", "clearErrorText", "()V", "clearErrorCode", "clearErrorToken", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "", "value", "getErrorText", "()Ljava/lang/String;", "setErrorText", "(Ljava/lang/String;)V", "errorText", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "setErrorCode", "(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;)V", IronSourceConstants.EVENTS_ERROR_CODE, "", "getErrorCodeValue", "()I", "setErrorCodeValue", "(I)V", "errorCodeValue", "Lcom/google/protobuf/ByteString;", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "setErrorToken", "(Lcom/google/protobuf/ByteString;)V", "errorToken", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ErrorOuterClass.Error.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ErrorKt$Dsl;", "builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            errorBuild.getClass();
            return errorBuild;
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        @NotNull
        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            errorCode.getClass();
            return errorCode;
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        @NotNull
        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            errorText.getClass();
            return errorText;
        }

        @NotNull
        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            errorToken.getClass();
            return errorToken;
        }

        public final void setErrorCodeValue(int i) {
            this._builder.setErrorCodeValue(i);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        public final void setErrorCode(@NotNull ErrorOuterClass.PublicErrorCode publicErrorCode) {
            publicErrorCode.getClass();
            this._builder.setErrorCode(publicErrorCode);
        }

        public final void setErrorText(@NotNull String str) {
            str.getClass();
            this._builder.setErrorText(str);
        }

        public final void setErrorToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setErrorToken(byteString);
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, e80 e80Var) {
            this(builder);
        }
    }

    private ErrorKt() {
    }
}
