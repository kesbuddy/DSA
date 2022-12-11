function [ones,zeros] = count_BW(img)
    bw  = im2bw(img);
    [r,c]=size(bw);
    ones=0;
    zeros=0;
    for i=1:r
        for j=1:c
            if bw(i,j)== 1
                ones=ones+1;
            else
                zeros=zeros+1;
            end
        end
    end
end