img = imread("cat.jfif");
img = rgb2gray(img);
img0 = double(img);

temp = 421;
for i=8:-1:1
    img1 = floor(img0 * double((2^i)/256));
    subplot(temp);imshow(img1,[0 2^i-1]);title(['Level = ', num2str(2^i)]);
    temp=temp+1;
end