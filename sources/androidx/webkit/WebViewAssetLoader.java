package androidx.webkit;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAssetLoader {
    public final ArrayList a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final ArrayList a = new ArrayList();

        public final WebViewAssetLoader a() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                Pair pair = (Pair) obj;
                arrayList.add(new PathMatcher((String) pair.a, (PathHandler) pair.b));
            }
            return new WebViewAssetLoader(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class InternalStoragePathHandler implements PathHandler {
        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final WebResourceResponse a(String str) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface PathHandler {
        WebResourceResponse a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ResourcesPathHandler implements PathHandler {
        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final WebResourceResponse a(String str) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AssetsPathHandler implements PathHandler {
        public final AssetHelper a;

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final WebResourceResponse a(String str) {
            try {
                AssetHelper assetHelper = this.a;
                String strSubstring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                InputStream inputStreamOpen = assetHelper.a.getAssets().open(strSubstring, 2);
                if (strSubstring.endsWith(".svgz")) {
                    inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                }
                return new WebResourceResponse(AssetHelper.a(str), null, inputStreamOpen);
            } catch (IOException e) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e);
                return new WebResourceResponse(null, null, null);
            }
        }

        public AssetsPathHandler(Context context) {
            this.a = new AssetHelper(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static class PathMatcher {
        public final String a;
        public final String b;
        public final PathHandler c;

        public PathMatcher(String str, PathHandler pathHandler) {
            if (!str.isEmpty() && str.charAt(0) == '/') {
                if (str.endsWith("/")) {
                    this.a = "appassets.androidplatform.net";
                    this.b = str;
                    this.c = pathHandler;
                    return;
                }
                d.r("Path should end with a slash '/'");
                throw null;
            }
            d.r("Path should start with a slash '/'.");
            throw null;
        }
    }

    public final WebResourceResponse a(Uri uri) {
        WebResourceResponse webResourceResponseA;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            webResourceResponseA = null;
            pathHandler = null;
            pathHandler = null;
            pathHandler = null;
            PathHandler pathHandler = null;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            PathMatcher pathMatcher = (PathMatcher) obj;
            pathMatcher.getClass();
            String str = pathMatcher.b;
            if (!uri.getScheme().equals(g.e) && ((uri.getScheme().equals(g.e) || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(pathMatcher.a) && uri.getPath().startsWith(str))) {
                pathHandler = pathMatcher.c;
            }
            if (pathHandler != null && (webResourceResponseA = pathHandler.a(uri.getPath().replaceFirst(str, ""))) != null) {
                break;
            }
        }
        return webResourceResponseA;
    }

    public WebViewAssetLoader(ArrayList arrayList) {
        this.a = arrayList;
    }
}
