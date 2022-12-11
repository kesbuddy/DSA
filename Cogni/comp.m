img = imread("cat.jfif");
b = im2bw(img);
bc = 1-b;
subplot(1,2,1);
imshow(b);
subplot(1,2,2);
imshow(bc);