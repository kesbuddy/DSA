img = imread("cat.jfif");
b = rgb2gray(img);
subplot(221);
imshow(b);
title("Original gray scale image");
subplot(223);
imhist(b);
title("Histogram of original image");
j = histeq(b);
subplot(222);
imshow(j);
title("Image after histogram equalization");
subplot(224);
imhist(j);
title("Histogram of Image after histogram equalization");