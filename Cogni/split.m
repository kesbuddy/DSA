img = imread("cat.jfif");
red = img(:,:,1);
green = img(:,:,2);
blue = img(:,:,3);
subplot(2,2,1);
imshow(img);
subplot(2,2,2);
imshow(red);
subplot(2,2,3);
imshow(green);
subplot(2,2,4);
imshow(blue);