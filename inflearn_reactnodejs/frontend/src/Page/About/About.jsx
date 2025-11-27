import React from "react";
import TotoroImage from "../../assets/totoro_image1.jpeg";

const About = () => {
  return (
    <div className="container mx-auto px-4 py-36 max-w-7xl">
      <div className="relative rounded-2xl overflow-hidden shadow-2xl mb-24">
        <img src={TotoroImage} className="w-full h-full object-cover" />
        {/* inset-0 요소를 부모 요소의 경계에 완전히 맞춥니다. (absolute, fixed, relative가 필요) */}
        <div className="absolute inset-0 bg-gradient-to-b from-transparent via-transparent to-slate-900"></div>
        <div className="absolute bottom-8 left-8 md:bottom-12 md:left-12 text-white">
          <h3 className="text-2xl md:text-4xl font-bold mb-2 md:mb-3">
            Zizi Company
          </h3>
          <p className="text-base md:text-xl font-light">
            당신을 지브리의 세계로 안내합니다.
          </p>
        </div>
      </div>

      <div className="mb-24 max-w-4xl mx-auto">
        <h2 className="text-4xl font-bold mb-8 text-slate-800 text-center">
          회사 소개
        </h2>
        <div className="text-lg leading-relaxed text-gray-600 space-y-6">
          <p>
            Zizi Company는 지브리를 소개합니다. 
            스튜디오 지브리는 1985년에 설립된 일본의 애니메이션 제작사로, 미야자키 하야오, 타카하타 이사오 등의 감독이 만든 《센과 치히로의 행방불명》, 《이웃집 토토로》 등 세계적으로 명성 높은 작품들을 선보였습니다. 
            컴퓨터 그래픽보다는 손그림으로 만든 따뜻한 영상미와 자연, 인간, 평화 등을 중시하는 주제 의식이 특징입니다. 
          </p>
          <p>
            스튜디오 지브리'의 명칭은 사하라 사막에 부는 열풍을 뜻하는 리비아어 'ghibli'에서 유래하였으며, 제2차 세계 대전 중 이탈리아의 비행기의 이름이기도 합니다.
            미야자키 하야오의 생각에서 '지브리'가 되었으나, 원어에 가까운 발음은 '기블리'입니다.
          </p>
        </div>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-3 gap-10 mb-24">
        {[
          { title: "캐릭터", desc: "다양한 캐릭터들의 성격" },
          { title: "작화", desc: "상상력을 자극하는 작화" },
          { title: "성장", desc: "캐릭터들의 지속적인 성장과정" },
        ].map((value, index) => (
          <div
            key={index}
            className="bg-white p-10 rounded-xl shadow-lg text-center hover:shadow-2xl transition-all duration-300 border border-gray-100"
          >
            <h3 className="text-2xl font-bold mb-4 text-amber-900">
              {value.title}
            </h3>
            <p className="text-gray-600 text-lg">{value.desc}</p>
          </div>
        ))}
      </div>

      <div className="mb-24 max-w-4xl mx-auto text-center">
        <h2 className="text-4xl font-bold mb-8 text-slate-800">회사 비전</h2>
        <p className="text-2xl leading-relaxed text-gray-600 font-light">
          "2030년까지 글로벌 시장을 선도하는 혁신 기업으로 도약하여,
          <br />더 나은 세상을 만드는데 기여하겠습니다."
        </p>
      </div>

      <div className="mb-12">
        <h2 className="text-4xl font-bold mb-12 text-slate-800 text-center">
          회사 연혁
        </h2>
        <div className="space-y-12 max-w-5xl mx-auto">
          {[
            { year: "2023", event: "글로벌 시장 진출" },
            { year: "2022", event: "시리즈 B 투자 유치" },
            { year: "2021", event: "주요 기술 특허 획득" },
            { year: "2020", event: "회사 설립" },
          ].map((item, index) => (
            <div
              key={index}
              //flex-row는 왼쪽 flex-row-reverse는 우측에 붙인다는 뜻
              className={`flex items-center gap-8 ${
                index % 2 === 0 ? "flex-row" : "flex-row-reverse"
              }`}
            >
              <div className="w-1/2 text-center">
                <div className="bg-white rounded-xl shadow-lg p-8 hover:shadow-2xl transition-all duration-300 border border-gray-100">
                  <h3 className="text-2xl font-bold mb-3 text-green-800">
                    {item.year}
                  </h3>
                  <p className="text-gray-700 text-lg">{item.event}</p>
                </div>
              </div>
              <div className="w-4 h-4 bg-amber-800 rounded-full"></div>
              <div className="w-1/2"></div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default About;
