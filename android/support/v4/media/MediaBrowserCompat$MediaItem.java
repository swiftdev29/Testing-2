package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f56a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDescriptionCompat f57b;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f56a = parcel.readInt();
        this.f57b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f56a + ", mDescription=" + this.f57b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f56a);
        this.f57b.writeToParcel(parcel, i10);
    }
}
