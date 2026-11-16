package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.credentials.CustomCredential;
import com.singular.sdk.internal.UserDetailsUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mu0 extends CustomCredential {
    public final String b;
    public final String c;

    public mu0(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super(bundle, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
        this.b = str;
        this.c = str2;
        if (str.length() > 0) {
            if (str2.length() > 0) {
                List listN0 = dk2.n0(str2, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6);
                if (listN0.size() == 3) {
                    try {
                        byte[] bArrDecode = Base64.decode((String) listN0.get(1), 8);
                        bArrDecode.getClass();
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
                        jSONObject.optString("email").getClass();
                        String strOptString = jSONObject.optString("sub");
                        if ((strOptString.length() == 0 ? null : strOptString) != null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("ID token missing required field: sub");
                        }
                    } catch (JSONException e) {
                        d.n(e);
                        throw null;
                    }
                }
                d.r("Invalid token format");
                throw null;
            }
            d.r("idToken should not be empty");
            throw null;
        }
        d.r("id should not be empty");
        throw null;
    }
}
