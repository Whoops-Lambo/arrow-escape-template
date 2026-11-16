package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zo extends bp {
    public final /* synthetic */ CarouselLayoutManager b;

    @Override // defpackage.bp
    public final int d() {
        return 0;
    }

    @Override // defpackage.bp
    public final int e() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.bp
    public final int a() {
        return this.b.getHeight();
    }

    @Override // defpackage.bp
    public final int b() {
        return this.b.getPaddingLeft();
    }

    @Override // defpackage.bp
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }
}
