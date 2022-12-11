img = imread("cat.jfif");
target_size = [40,50];
r = centerCropWindow2d(size(img),target_size);
cr = imcrop(img,r);
subplot(121);
imshow(img);
subplot(122);
imshow(cr);