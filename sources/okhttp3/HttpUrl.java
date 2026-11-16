package okhttp3;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventParameters;
import com.explorestack.protobuf.openrtb.LossReason;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.singular.sdk.internal.SLRemoteConfiguration;
import com.singular.sdk.internal.UserDetailsUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ak1;
import defpackage.d;
import defpackage.dk2;
import defpackage.dr0;
import defpackage.e32;
import defpackage.e80;
import defpackage.eu;
import defpackage.gg0;
import defpackage.h71;
import defpackage.jc1;
import defpackage.kg0;
import defpackage.kk2;
import defpackage.pv1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.vk3;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;
    private final boolean isHttps;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;

    @Nullable
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;

    @NotNull
    private final String url;

    @NotNull
    private final String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000 e2\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u0006J\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\"J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0006J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010.\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00108\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010/2\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b\u0012\u0010=J\u0017\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ'\u0010D\u001a\u00020?2\u0006\u00105\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bD\u0010EJ7\u0010H\u001a\u00020?2\u0006\u00105\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010G\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020;2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020;2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020?H\u0002¢\u0006\u0004\bM\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u00103\"\u0004\bP\u0010AR\"\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010N\u001a\u0004\bQ\u00103\"\u0004\bR\u0010AR\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010N\u001a\u0004\bS\u00103\"\u0004\bT\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010N\u001a\u0004\bU\u00103\"\u0004\bV\u0010AR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010:\"\u0004\bY\u0010ZR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b]\u0010^R,\u0010_\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^\"\u0004\ba\u0010bR$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010N\u001a\u0004\bc\u00103\"\u0004\bd\u0010A¨\u0006f"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "encodedUsername", "password", "encodedPassword", "host", "", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", TtmlNode.RUBY_BASE, "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "effectivePort", "()I", "", "alreadyEncoded", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Laz2;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "pop", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) {
                try {
                    int i = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > i || i >= 65536) {
                        return -1;
                    }
                    return i;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((s71.h(cCharAt, 97) >= 0 && s71.h(cCharAt, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) <= 0) || (s71.h(cCharAt, 65) >= 0 && s71.h(cCharAt, 90) <= 0)) {
                    int i = pos + 1;
                    while (i < limit) {
                        int i2 = i + 1;
                        char cCharAt2 = input.charAt(i);
                        if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i = i2;
                        } else if (cCharAt2 == ':') {
                            return i;
                        }
                    }
                }
                return -1;
            }

            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            private Companion() {
            }
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            int i = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                this.push(pathSegments, i, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
                i = iDelimiterOffset + 1;
                if (i > pathSegments.length()) {
                    return this;
                }
                this = this;
                pathSegments = pathSegments;
                alreadyEncoded = alreadyEncoded;
            }
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String encodedQuery) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            List<String> queryNamesAndValues$okhttp = null;
            if (encodedQuery != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), encodedQuery, 0, 0, " \"'<>#", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null)) != null) {
                queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        @NotNull
        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                ak1.n(s71.B(Integer.valueOf(port), "unexpected port: "));
                return null;
            }
            setPort$okhttp(port);
            return this;
        }

        @NotNull
        public final Builder query(@Nullable String query) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            List<String> queryNamesAndValues$okhttp = null;
            if (query != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), query, 0, 0, " \"'<>#", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null)) != null) {
                queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            return s71.b(input, UserDetailsUtils.UserDetailsLiterals.DOT) || kk2.E(input, "%2e", true);
        }

        private final boolean isDotDot(String input) {
            return s71.b(input, "..") || kk2.E(input, "%2e.", true) || kk2.E(input, ".%2e", true) || kk2.E(input, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            int length = ((CharSequence) pv1.i(1, this.encodedPathSegments)).length();
            List<String> list = this.encodedPathSegments;
            if (length == 0) {
                list.set(list.size() - 1, strCanonicalize$okhttp$default);
            } else {
                list.add(strCanonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int iN = vk3.n(size, 0, -2);
            if (iN > size) {
                return;
            }
            while (true) {
                int i = size - 2;
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (s71.b(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iN) {
                    return;
                } else {
                    size = i;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i = startPos;
            while (i < limit) {
                int iDelimiterOffset = Util.delimiterOffset(input, "/\\", i, limit);
                boolean z = iDelimiterOffset < limit;
                this = this;
                input = input;
                this.push(input, i, iDelimiterOffset, z, true);
                i = z ? iDelimiterOffset + 1 : iDelimiterOffset;
            }
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                e32.i("scheme == null");
                return null;
            }
            Companion companion = HttpUrl.INSTANCE;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                e32.i("host == null");
                return null;
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(eu.f(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                arrayList = new ArrayList(eu.f(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String encodedFragment) {
            setEncodedFragment$okhttp(encodedFragment == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null));
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String fragment) {
            setEncodedFragment$okhttp(fragment == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null));
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @NotNull
        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        @Nullable
        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @Nullable
        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl base, @NotNull String input) {
            int iDelimiterOffset;
            int i;
            boolean z;
            int i2;
            int i3;
            int i4;
            char c;
            int i5;
            String str = input;
            str.getClass();
            Builder builder = null;
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z2 = true;
            int i6 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (kk2.K(iIndexOfFirstNonAsciiWhitespace$default, str, true, "https:")) {
                    this.scheme = HttpRequest.DEFAULT_SCHEME;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!kk2.K(iIndexOfFirstNonAsciiWhitespace$default, str, true, "http:")) {
                        dr0.i("Expected URL scheme 'http' or 'https' but was '", str.substring(0, iSchemeDelimiterOffset), 39);
                        return null;
                    }
                    this.scheme = g.e;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    d.r(s71.B(str.length() > 6 ? s71.B("...", dk2.w0(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                    return null;
                }
                this.scheme = base.scheme();
            }
            int iSlashCount = companion.slashCount(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            int i7 = 63;
            int i8 = 35;
            if (iSlashCount >= 2 || base == null || !s71.b(base.scheme(), this.scheme)) {
                int i9 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str, "@/\\?#", i9, iIndexOfLastNonAsciiWhitespace$default);
                    int iCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : i6;
                    if (iCharAt == i6 || iCharAt == i8 || iCharAt == 47 || iCharAt == 92 || iCharAt == i7) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z3) {
                            z = z2;
                            i2 = i6;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str = input;
                            i3 = iDelimiterOffset;
                            sb.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i9, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str, ':', i9, iDelimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            i2 = i6;
                            z = z2;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i9, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z4) {
                                strCanonicalize$okhttp$default = jc1.o(this.encodedUsername, "%40", new StringBuilder(), strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i4 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = z;
                            } else {
                                i4 = iDelimiterOffset;
                            }
                            str = input;
                            i3 = i4;
                            z4 = z;
                        }
                        i9 = i3 + 1;
                        i6 = i2;
                        z2 = z;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        builder = builder;
                        i7 = 63;
                        i8 = 35;
                    }
                }
                Builder builder2 = builder;
                i = iIndexOfLastNonAsciiWhitespace$default;
                int i10 = i6;
                Companion companion3 = INSTANCE;
                int iPortColonOffset = companion3.portColonOffset(str, i9, iDelimiterOffset);
                int i11 = iPortColonOffset + 1;
                if (i11 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str, i9, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(str, i11, iDelimiterOffset);
                    this.port = port;
                    if (port == i10) {
                        dr0.p("Invalid URL port: \"", str.substring(i11, iDelimiterOffset), 34);
                        return builder2;
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i9, iPortColonOffset, false, 4, null));
                    String str2 = this.scheme;
                    str2.getClass();
                    this.port = companion4.defaultPort(str2);
                }
                if (this.host == null) {
                    dr0.p("Invalid URL host: \"", str.substring(i9, iPortColonOffset), 34);
                    return builder2;
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i12 = i;
            int iDelimiterOffset3 = Util.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, i12);
            resolvePath(str, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i12 || str.charAt(iDelimiterOffset3) != '?') {
                c = '#';
                i5 = iDelimiterOffset3;
            } else {
                c = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(str, '#', iDelimiterOffset3, i12);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, iDelimiterOffset3 + 1, iDelimiterOffset4, " \"'<>#", true, false, true, false, null, 208, null));
                i5 = iDelimiterOffset4;
            }
            if (i5 < i12 && str.charAt(i5) == c) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i5 + 1, i12, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String strReplaceAll;
            String host = getHost();
            if (host == null) {
                strReplaceAll = null;
            } else {
                Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
                patternCompile.getClass();
                strReplaceAll = patternCompile.matcher(host).replaceAll("");
                strReplaceAll.getClass();
            }
            setHost$okhttp(strReplaceAll);
            int size = getEncodedPathSegments$okhttp().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                getEncodedPathSegments$okhttp().set(i2, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, getEncodedPathSegments$okhttp().get(i2), 0, 0, "[]", true, true, false, false, null, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str = encodedQueryNamesAndValues$okhttp.get(i);
                    encodedQueryNamesAndValues$okhttp.set(i, str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i = i3;
                }
            }
            String encodedFragment = getEncodedFragment();
            setEncodedFragment$okhttp(encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (getScheme() != null) {
                sb.append(getScheme());
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (getEncodedUsername().length() > 0 || getEncodedPassword().length() > 0) {
                sb.append(getEncodedUsername());
                if (getEncodedPassword().length() > 0) {
                    sb.append(':');
                    sb.append(getEncodedPassword());
                }
                sb.append('@');
            }
            if (getHost() != null) {
                String host = getHost();
                host.getClass();
                if (dk2.P(host, ':')) {
                    sb.append('[');
                    sb.append(getHost());
                    sb.append(']');
                } else {
                    sb.append(getHost());
                }
            }
            if (getPort() != -1 || getScheme() != null) {
                int iEffectivePort = effectivePort();
                if (getScheme() != null) {
                    Companion companion = HttpUrl.INSTANCE;
                    String scheme = getScheme();
                    scheme.getClass();
                    if (iEffectivePort != companion.defaultPort(scheme)) {
                        sb.append(':');
                        sb.append(iEffectivePort);
                    }
                } else {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            Companion companion2 = HttpUrl.INSTANCE;
            companion2.toPathString$okhttp(getEncodedPathSegments$okhttp(), sb);
            if (getEncodedQueryNamesAndValues$okhttp() != null) {
                sb.append('?');
                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
                encodedQueryNamesAndValues$okhttp.getClass();
                companion2.toQueryString$okhttp(encodedQueryNamesAndValues$okhttp, sb);
            }
            if (getEncodedFragment() != null) {
                sb.append('#');
                sb.append(getEncodedFragment());
            }
            return sb.toString();
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            encodedPathSegment.getClass();
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            encodedPathSegments.getClass();
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            String strCanonicalize$okhttp$default;
            encodedName.getClass();
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            encodedQueryNamesAndValues$okhttp.getClass();
            Companion companion = HttpUrl.INSTANCE;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            encodedQueryNamesAndValues$okhttp2.getClass();
            if (encodedValue == null) {
                strCanonicalize$okhttp$default = null;
            } else {
                strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(strCanonicalize$okhttp$default);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            pathSegment.getClass();
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String value) {
            String strCanonicalize$okhttp$default;
            name.getClass();
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            encodedQueryNamesAndValues$okhttp.getClass();
            Companion companion = HttpUrl.INSTANCE;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            encodedQueryNamesAndValues$okhttp2.getClass();
            if (value == null) {
                strCanonicalize$okhttp$default = null;
            } else {
                strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(strCanonicalize$okhttp$default);
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            encodedPassword.getClass();
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            encodedPath.getClass();
            if (kk2.L(encodedPath, "/", false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            ak1.n(s71.B(encodedPath, "unexpected encodedPath: "));
            return null;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            encodedUsername.getClass();
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            host.getClass();
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                setHost$okhttp(canonicalHost);
                return this;
            }
            d.r(s71.B(host, "unexpected host: "));
            return null;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            password.getClass();
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            encodedName.getClass();
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            name.getClass();
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int index) {
            getEncodedPathSegments$okhttp().remove(index);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            scheme.getClass();
            if (scheme.equalsIgnoreCase(g.e)) {
                setScheme$okhttp(g.e);
                return this;
            }
            if (scheme.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                setScheme$okhttp(HttpRequest.DEFAULT_SCHEME);
                return this;
            }
            d.r(s71.B(scheme, "unexpected scheme: "));
            return null;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int index, @NotNull String encodedPathSegment) {
            encodedPathSegment.getClass();
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(index, strCanonicalize$okhttp$default);
            if (!isDot(strCanonicalize$okhttp$default) && !isDotDot(strCanonicalize$okhttp$default)) {
                return this;
            }
            ak1.n(s71.B(encodedPathSegment, "unexpected path segment: "));
            return null;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        @NotNull
        public final Builder setPathSegment(int index, @NotNull String pathSegment) {
            pathSegment.getClass();
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 251, null);
            if (!isDot(strCanonicalize$okhttp$default) && !isDotDot(strCanonicalize$okhttp$default)) {
                getEncodedPathSegments$okhttp().set(index, strCanonicalize$okhttp$default);
                return this;
            }
            ak1.n(s71.B(pathSegment, "unexpected path segment: "));
            return null;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            username.getClass();
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            pathSegments.getClass();
            return addPathSegments(pathSegments, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b$\u0010\"J\u001b\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&*\u00020\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010-\u001a\u00020**\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u00020\u0005H\u0007¢\u0006\u0004\b.\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000200H\u0007¢\u0006\u0004\b+\u00101J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000202H\u0007¢\u0006\u0004\b+\u00103J\u0017\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b5\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b6\u0010,J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u000200H\u0007¢\u0006\u0004\b5\u00101J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00107\u001a\u000202H\u0007¢\u0006\u0004\b5\u00103J1\u0010:\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b8\u00109Jc\u0010=\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010?R\u0014\u0010F\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010?R\u0014\u0010G\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010?R\u0014\u0010H\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010I\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010J\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010K\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010L\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010?¨\u0006M"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "Lokio/Buffer;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Laz2;", "writePercentDecoded", "(Lokio/Buffer;Ljava/lang/String;IIZ)V", "isPercentEncoded", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", G5.N, "writeCanonicalized", "(Lokio/Buffer;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "defaultPort", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 8) != 0) {
                z = false;
            }
            if ((i3 & 16) != 0) {
                z2 = false;
            }
            if ((i3 & 32) != 0) {
                z3 = false;
            }
            if ((i3 & 64) != 0) {
                z4 = false;
            }
            if ((i3 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i, i2, str2, z, z2, z3, z4, charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        private final void writeCanonicalized(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            Buffer buffer2 = null;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? UserDetailsUtils.UserDetailsLiterals.PLUS : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || dk2.P(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i, i2)))))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, i, Character.charCount(iCodePointAt) + i, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b = buffer2.readByte();
                            int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[(i3 >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[b & 15]);
                        }
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                i += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i = Character.charCount(iCodePointAt) + i3;
                    }
                } else if (iCodePointAt == 43 && z) {
                    buffer.writeByte(32);
                    i++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1303deprecated_get(@NotNull String url) {
            url.getClass();
            return get(url);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m1306deprecated_parse(@NotNull String url) {
            url.getClass();
            return parse(url);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) throws EOFException {
            str.getClass();
            str2.getClass();
            int iCharCount = i;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z4) && !dk2.P(str2, (char) iCodePointAt) && ((iCodePointAt != 37 || (z && (!z2 || isPercentEncoded(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3)))) {
                    iCharCount += Character.charCount(iCodePointAt);
                } else {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                    return buffer.readUtf8();
                }
            }
            return str.substring(i, i2);
        }

        public final int defaultPort(@NotNull String scheme) {
            scheme.getClass();
            if (scheme.equals(g.e)) {
                return 80;
            }
            if (scheme.equals(HttpRequest.DEFAULT_SCHEME)) {
                return 443;
            }
            return -1;
        }

        @NotNull
        public final HttpUrl get(@NotNull String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i, int i2, boolean z) {
            str.getClass();
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt != '%' && (cCharAt != '+' || !z)) {
                    i3 = i4;
                } else {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            return str.substring(i, i2);
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            list.getClass();
            sb.getClass();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            str.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iW = dk2.W(str, '&', i, 4);
                if (iW == -1) {
                    iW = str.length();
                }
                int iW2 = dk2.W(str, G5.U, i, 4);
                if (iW2 != -1 && iW2 <= iW) {
                    arrayList.add(str.substring(i, iW2));
                    arrayList.add(str.substring(iW2 + 1, iW));
                } else {
                    arrayList.add(str.substring(i, iW));
                    arrayList.add(null);
                }
                i = iW + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            list.getClass();
            sb.getClass();
            h71 h71VarA = tb5.A(2, tb5.D(0, list.size()));
            int i = h71VarA.a;
            int i2 = h71VarA.b;
            int i3 = h71VarA.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                int i4 = i + i3;
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append(G5.U);
                    sb.append(str2);
                }
                if (i != i2) {
                    i = i4;
                } else {
                    return;
                }
            }
        }

        private Companion() {
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1305deprecated_get(@NotNull URL url) {
            url.getClass();
            return get(url);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m1304deprecated_get(@NotNull URI uri) {
            uri.getClass();
            return get(uri);
        }

        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            url.getClass();
            String string = url.toString();
            string.getClass();
            return parse(string);
        }

        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            return parse(string);
        }
    }

    public static final int defaultPort(@NotNull String str) {
        return INSTANCE.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m1293deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(dk2.W(this.url, '#', 0, 6) + 1);
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(dk2.W(this.url, ':', this.scheme.length() + 3, 4) + 1, dk2.W(this.url, '@', 0, 6));
    }

    @NotNull
    public final String encodedPath() {
        int iW = dk2.W(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        return this.url.substring(iW, Util.delimiterOffset(str, "?#", iW, str.length()));
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int iW = dk2.W(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iW, str.length());
        ArrayList arrayList = new ArrayList();
        while (iW < iDelimiterOffset) {
            int i = iW + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            arrayList.add(this.url.substring(i, iDelimiterOffset2));
            iW = iDelimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iW = dk2.W(this.url, '?', 0, 6) + 1;
        String str = this.url;
        return this.url.substring(iW, Util.delimiterOffset(str, '#', iW, str.length()));
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof HttpUrl) && s71.b(((HttpUrl) other).url, this.url);
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    /* JADX INFO: renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @NotNull
    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            dr0.b();
            return null;
        }
        String str = list.get(index * 2);
        str.getClass();
        return str;
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return kg0.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h71 h71VarA = tb5.A(2, tb5.D(0, this.queryNamesAndValues.size()));
        int i = h71VarA.a;
        int i2 = h71VarA.b;
        int i3 = h71VarA.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                String str = this.queryNamesAndValues.get(i);
                str.getClass();
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        dr0.b();
        return null;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        builderNewBuilder.getClass();
        return builderNewBuilder.username("").password("").build().getUrl();
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            dr0.m(e);
            return null;
        }
    }

    @NotNull
    public final String username() {
        return this.username;
    }

    public HttpUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str6.getClass();
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = s71.b(str, HttpRequest.DEFAULT_SCHEME);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m1284deprecated_encodedFragment() {
        return encodedFragment();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m1285deprecated_encodedPassword() {
        return encodedPassword();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m1286deprecated_encodedPath() {
        return encodedPath();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m1287deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m1288deprecated_encodedQuery() {
        return encodedQuery();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m1289deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m1294deprecated_pathSize() {
        return pathSize();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m1296deprecated_query() {
        return query();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m1297deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m1298deprecated_querySize() {
        return querySize();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m1300deprecated_uri() {
        return uri();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m1301deprecated_url() {
        return url();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        name.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            h71 h71VarA = tb5.A(2, tb5.D(0, list.size()));
            int i = h71VarA.a;
            int i2 = h71VarA.b;
            int i3 = h71VarA.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return null;
            }
            while (true) {
                int i4 = i + i3;
                if (name.equals(this.queryNamesAndValues.get(i))) {
                    return this.queryNamesAndValues.get(i + 1);
                }
                if (i != i2) {
                    i = i4;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        name.getClass();
        if (this.queryNamesAndValues == null) {
            return gg0.a;
        }
        ArrayList arrayList = new ArrayList();
        h71 h71VarA = tb5.A(2, tb5.D(0, this.queryNamesAndValues.size()));
        int i = h71VarA.a;
        int i2 = h71VarA.b;
        int i3 = h71VarA.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                if (name.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        link.getClass();
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder == null) {
            return null;
        }
        return builderNewBuilder.build();
    }

    @NotNull
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile.getClass();
                string.getClass();
                String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                strReplaceAll.getClass();
                URI uriCreate = URI.create(strReplaceAll);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                dr0.m(e);
                return null;
            }
        }
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return INSTANCE.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return INSTANCE.get(url);
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
