import React from "react";
import HeroImage from "../../assets/kiki_image1.png";

const Hero = () => {
  return (
    <div className="relative min-h-[110vh] bg-gradient-to-b from-gray-50 to-white pb-0">
      <div className="container mx-auto px-4 sm:px-6 lg:px-8 py-24 lg:py-36">
        <div className="flex flex-col lg:flex-row items-center justify-between gap-12">
          <div className="flex-1 text-center lg:text-left">
            <h1 className="text-3xl sm:text-3xl 2xl:text-4xl font-bold text-gray-900 leading-tight mb-6 lg:mb-12">
              올해도 지브리와 함께
              <span className="block text-amber-900 mt-2 lg:mt-6">
                텅장이 되어갑니다...
              </span>
            </h1>
            <p className="text-lg sm:text-xl text-gray-800 text-semibold mb-8 max-w-2xl mx-auto ">
              마녀배달부 키키에서 부터 이웃집 토토로까지, 귀여운 아이들이 한가득
            </p>
           <div className="flex flex-col sm:flex-row gap-4 justify-center lg:justify-start">
              <button className="px-8 py-4 bg-green-800 text-white rounded-lg hover:bg-green-800 transition-colors duration-300 text-lg font-semibold shadow-lg hover:shadow-xl">
                상담 신청하기
              </button>
              <button className="px-8 py-4 bg-white text-green-800 rounded-lg border-2 border-green-800 hover:bg-blue-50 transition-colors duration-300 text-lg font-semibold">
                더 알아보기
              </button>
            </div>
          </div>
          <div className="flex-1 w-full max-w-2xl lg:max-w-none">
            <div className="relative">
              <img
                src={HeroImage}
                className="relative rounded-2xl shadow-2xl w-full object-cover transform hover:scale-[1.02] transition-transform duration-300"
              />
            </div>
          </div>
        </div>
      </div>
      <div className="container mx-auto px-4">
        <div className="grid grid-cols-2 md:grid-cols-4 gap-8 max-w-4xl mx-auto">
          {[
            { number: "1,200+", label: "팬" },
            { number: "100%", label: "고객 만족도" },
            { number: "25년+", label: "업계 경력" },
            { number: "MAX", label: "귀여움" },
          ].map((stat, index) => (
            <div key={index} className="text-center">
              <div className="text-3xl font-bold text-amber-900">
                {stat.number}
              </div>
              <div className="text-gray-900">{stat.label}</div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Hero;
